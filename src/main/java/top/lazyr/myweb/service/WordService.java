package top.lazyr.myweb.service;

import com.clsaa.rest.result.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import top.lazyr.myweb.repository.WordDao;
import top.lazyr.myweb.model.po.MyWord;
import top.lazyr.myweb.model.vo.RelatedWord;
import top.lazyr.myweb.util.JavaBeanUtil;

import javax.persistence.criteria.*;
import java.util.List;

@Service
public class WordService {
    @Autowired
    private WordDao dao;

    public MyWord getOneById(long id) {
        return dao.getOne(id);
    }

    public int getSearchCountById(long id) {
        MyWord myWord = dao.getOne(id);
        return myWord == null?null:myWord.getSearchCount();
    }

    public String getWordsById(long id) {
        MyWord myWord = dao.getOne(id);
        return myWord == null?null:myWord.getWords();
    }

    public MyWord getOneByWords(String word) {
        return dao.getOneByWords(word);
    }

    public Pagination<RelatedWord> getAllByWord(Integer pageNo, Integer pageSize,String word) {
        Specification<MyWord> specification = new Specification<MyWord>() {

            @Override
            public Predicate toPredicate(Root<MyWord> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Path words = root.get("words");
                Predicate predicate = criteriaBuilder.like(words, "%" + word + "%");
                return predicate;
            }
        };

        Sort sort = Sort.by(Sort.Direction.DESC, "searchCount");
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        Page<MyWord> allWords = dao.findAll(specification, pageable);
        List<RelatedWord> relatedWords = JavaBeanUtil.myWords2RelatedWords(allWords.getContent(),word);
        Pagination<RelatedWord> pagination = new Pagination<>();
        pagination.setPageNo(pageNo);
        pagination.setPageSize(pageSize);
        pagination.setPageList(relatedWords);
        pagination.setTotalCount(dao.getAllByWords("%"+word+"%").size());
        return pagination;
    }

    public int updateSearchCountById(long id) {
        return dao.updateSearchCountById(id);
    }

    public int insertOne(String words) {
        return insertOne(MyWord.builder().words(words).build());
    }

    public int insertOne(MyWord myWord) {
        return dao.save(myWord) == null?null:1;
    }

    public int insertAll(List<MyWord> myWords) {
        return dao.saveAll(myWords)==null?null:myWords.size();
    }
}
