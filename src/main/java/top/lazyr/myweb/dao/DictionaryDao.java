package top.lazyr.myweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import top.lazyr.myweb.model.pojo.MyDictionary;

import javax.transaction.Transactional;
import java.util.List;


public interface DictionaryDao extends JpaRepository<MyDictionary,Long>, JpaSpecificationExecutor<MyDictionary> {

    @Query(value = "from MyDictionary where word like ?1")
    List<MyDictionary> getAllByWord(String word);

    @Query(value = "from MyDictionary where word = ?1")
    MyDictionary getOneByWord(String word);


    @Query(value = "select * from dictionary  ORDER BY recent_time_modified desc limit 5",nativeQuery = true)
    List<MyDictionary> getLatestByTime();

    @Modifying
    @Transactional
    @Query(value = "update MyDictionary set recentTimeModified = CURRENT_TIMESTAMP, searchCount = searchCount+1 where id = ?1")
    int updateTimeAndSearchCount(Long id);
}
