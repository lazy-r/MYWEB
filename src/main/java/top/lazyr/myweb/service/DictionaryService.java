package top.lazyr.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lazyr.myweb.repository.DictionaryDao;
import top.lazyr.myweb.model.po.MyDictionary;
import top.lazyr.myweb.util.HttpParseUtil;

import java.util.List;

@Service
public class DictionaryService {
    @Autowired
    private DictionaryDao dao;

    public String getTranslationById(Long id) {
        MyDictionary dictionary = dao.getOne(id);
        return dictionary == null?null:dictionary.getTranslation();
    }

    public int getSearchCountById(Long id) {
        MyDictionary dictionary = dao.getOne(id);
        return dictionary == null?null:dictionary.getSearchCount();
    }

    public MyDictionary getOneById(Long id) {
        return dao.getOne(id);
    }

    public String getTranslationByWord(String word) {
        MyDictionary dictionary = dao.getOneByWord(word);
        return dictionary == null?null:dictionary.getTranslation();
    }

    public int getSearchCountByWord(String word) {
        MyDictionary dictionary = dao.getOneByWord(word);
        return dictionary == null?null:dictionary.getSearchCount();
    }

    public MyDictionary getOneByWord(String word) {
        MyDictionary one = dao.getOneByWord(word);
        if(one == null){
            System.out.println("单词："+word+"未找到，将自动补充到字典里");
            String translation = HttpParseUtil.translateWord(word);
            one = MyDictionary.builder().word(word).translation(translation).build();
            dao.save(one);
        }
        return one;
    }

    public List<MyDictionary> getAllByWord(String word) {
        return dao.getAllByWord("%"+word+"%");
    }

    public List<MyDictionary> getLatestByTime() {
        return dao.getLatestByTime();
    }

    public int updateTimeAndSearchCount(Long id) {
        return dao.updateTimeAndSearchCount(id);
    }

    public int insertOne(MyDictionary dictionary) {
        return dao.save(dictionary) == null?null:1;
    }

    public int insertOne(String word, String translation) {
        return insertOne(MyDictionary.builder().word(word).translation(translation).build());
    }

    public int insertAll(List<MyDictionary> dictionaries) {
        return dao.saveAll(dictionaries) == null?null:dictionaries.size();
    }



}
