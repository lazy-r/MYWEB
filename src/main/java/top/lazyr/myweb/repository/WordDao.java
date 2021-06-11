package top.lazyr.myweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import top.lazyr.myweb.model.po.MyWord;

import javax.transaction.Transactional;
import java.util.List;


public interface WordDao extends JpaRepository<MyWord,Long>, JpaSpecificationExecutor<MyWord> {
    @Query(value = "from MyWord where words like ?1")
    List<MyWord> getAllByWords(String word);

    @Query(value = "from MyWord where words = ?1")
    MyWord getOneByWords(String words);

    @Modifying
    @Transactional
    @Query(value = "update MyWord set searchCount = searchCount+1 where id = ?1")
    int updateSearchCountById(Long id);


}
