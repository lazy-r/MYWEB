package top.lazyr.myweb;

import com.clsaa.rest.result.Pagination;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lazyr.myweb.dao.DictionaryDao;
import top.lazyr.myweb.dao.WordDao;
import top.lazyr.myweb.model.pojo.MyDictionary;
import top.lazyr.myweb.model.pojo.MyWord;
import top.lazyr.myweb.model.vo.RelatedWord;
import top.lazyr.myweb.service.WordService;
import top.lazyr.myweb.util.FileUtil;

import java.util.*;

@SpringBootTest
class MywebApplicationTests {
//    @Autowired
//    private WordDao dao;
//    @Autowired
//    private DictionaryDao dictionaryDao;
//    @Autowired
//    private WordService service;
//
//    @Test
//    void testWordService(){
//        Pagination<RelatedWord> can = service.getAllByWord(1, 8, "can");
//        System.out.println(can.getPageList().toString());
//    }
//
//    @Test
//    void testWordDao() {
//        int i = dao.updateSearchCountById(1l);
//        System.out.println(dao.getOne(1l));
//
//    }
//
//    @Test
//    void testDictionaryDao(){
//        List<MyDictionary> latestByTime = dictionaryDao.getLatestByTime();
//        for (MyDictionary myDictionary : latestByTime) {
//            System.out.println(myDictionary);
//        }
//    }
//    @Test
//    public void insertDataToWord() {
//        String fileByLine = FileUtil.readFileByLine("C:\\Users\\Lazy r\\Desktop\\myweb\\word.txt");
//        String[] allWords = fileByLine.split("\n");
//        List<MyWord> list = new ArrayList<>();
//        Map<String,String> map = new HashMap<>();
//        for (String words : allWords) {
//            if(!map.containsKey(words.trim())){
//                list.add(MyWord.builder().words(words.trim()).build());
//                map.put(words.trim(),"");
//            }
//        }
//        dao.saveAll(list);
//    }
//
//    @Test
//    public void insertDateToDictionary(){
//        String fileByLine = FileUtil.readFileByLine("C:\\Users\\Lazy r\\Desktop\\myweb\\mydic.txt");
//        String[] allWords = fileByLine.split("\n\n");
//        List<MyDictionary> list = new ArrayList<>();
//        Map<String,String> map = new HashMap<>();
//        for (String words : allWords) {
//            String[] dic = words.split(":");
//            if(dic.length>1 && !map.containsKey(dic[0].trim())){
//                list.add(MyDictionary.builder().word(dic[0]).translation(dic[1].trim().replaceAll("\n","<br/>")).build());
//                map.put(dic[0].trim(),"");
//            }
//        }
//        dictionaryDao.saveAll(list);
//    }
}
