package top.lazyr.myweb.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.lazyr.myweb.model.pojo.MyDictionary;
import top.lazyr.myweb.service.DictionaryService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dic/t")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;


    @GetMapping("/latestWords")
    public List<MyDictionary> getLatestWords(){
        List<MyDictionary> latestWords = dictionaryService.getLatestByTime();
        for (MyDictionary latestWord : latestWords) {
            System.out.println(latestWord.getTranslation()+"\n");
        }
        return latestWords;
    }

    @GetMapping
    public MyDictionary getTranslation( @RequestParam(value = "word",required = true)String word){
        MyDictionary dictionary = dictionaryService.getOneByWord(word);
        dictionaryService.updateTimeAndSearchCount(dictionary.getId());
        return dictionary;
    }

}
