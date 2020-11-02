package top.lazyr.myweb.service;


import top.lazyr.myweb.model.pojo.MyDictionary;
import top.lazyr.myweb.model.pojo.MyWord;

import java.util.List;

public interface DictionaryService {

    String getTranslationById(Long id);
    int getSearchCountById(Long id);
    MyDictionary getOneById(Long id);

    String getTranslationByWord(String word);
    int getSearchCountByWord(String word);
    MyDictionary getOneByWord(String word);
    List<MyDictionary> getAllByWord(String word);

    List<MyDictionary> getLatestByTime();

    int updateTimeAndSearchCount(Long id);

    int insertOne(MyDictionary dictionary);

    int insertOne(String word,String translation);

    int insertAll(List<MyDictionary> dictionaries);

}
