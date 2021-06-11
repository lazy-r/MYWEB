package top.lazyr.myweb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.lazyr.myweb.model.po.MyDictionary;
import top.lazyr.myweb.service.DictionaryService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dic/t")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;


    @ApiOperation(value = "获取最近查看的五个单词",notes = "获取最近查看的五个单词")
    @GetMapping("/latestWords")
    public List<MyDictionary> getLatestWords(){
        List<MyDictionary> latestWords = dictionaryService.getLatestByTime();
        for (MyDictionary latestWord : latestWords) {
            System.out.println(latestWord.getTranslation()+"\n");
        }
        return latestWords;
    }

    @GetMapping
    public MyDictionary getTranslation( @ApiParam(name = "word", value = "待获取翻译的单词",required = true) @RequestParam(value = "word",required = true)String word){
        MyDictionary dictionary = dictionaryService.getOneByWord(word);
        dictionaryService.updateTimeAndSearchCount(dictionary.getId());
        return dictionary;
    }

}
