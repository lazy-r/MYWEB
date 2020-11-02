package top.lazyr.myweb.controller;


import com.clsaa.rest.result.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.lazyr.myweb.model.vo.RelatedWord;
import top.lazyr.myweb.service.WordService;

@CrossOrigin
@RestController
@RequestMapping("/dic/eng")
public class WordController {
    @Autowired
    private WordService service;

    @GetMapping
    public Pagination<RelatedWord> getAllWords(
                                                @RequestParam(value = "pageNo",required = true)Integer pageNo,
                                                @RequestParam(value = "pageSize",required = true)Integer pageSize,
                                                @RequestParam(value = "word",required = true)String word){
        Pagination<RelatedWord> all = service.getAllByWord(pageNo, pageSize, word);
        return all;
    }
}
