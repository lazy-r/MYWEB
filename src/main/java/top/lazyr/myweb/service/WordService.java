package top.lazyr.myweb.service;

import com.clsaa.rest.result.Pagination;
import top.lazyr.myweb.model.pojo.MyWord;
import top.lazyr.myweb.model.vo.RelatedWord;

import java.util.List;

public interface WordService {

    MyWord getOneById(long id);
    int getSearchCountById(long id);
    String getWordsById(long id);

    MyWord getOneByWords(String word);
//    List<MyWord> getAllByWord(String word);
    Pagination<RelatedWord> getAllByWord(Integer pageNo, Integer pageSize,String word);

    int updateSearchCountById(long id);

    int insertOne(String words);
    int insertOne(MyWord myWord);
    int insertAll(List<MyWord> myWords);
}
