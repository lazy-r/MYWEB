package top.lazyr.myweb.util;

import top.lazyr.myweb.model.pojo.MyWord;
import top.lazyr.myweb.model.vo.RelatedWord;

import java.util.ArrayList;
import java.util.List;

public class JavaBeanUtil {
    public static RelatedWord myWord2RelatedWord(MyWord myWord){
        return RelatedWord.builder()
                .id(myWord.getId())
                .searchCount(myWord.getSearchCount())
                .words(myWord.getWords().split(" "))
                .highlightWords(myWord.getWords().split(" ")).build();
    }

    public static List<RelatedWord> myWords2RelatedWords(List<MyWord> myWords){
        List<RelatedWord> relatedWords = new ArrayList<>();
        myWords.forEach(item->{
            relatedWords.add(myWord2RelatedWord(item));
        });
        return relatedWords;
    }


    public static List<RelatedWord> myWords2RelatedWords(List<MyWord> myWords,String word){
        List<RelatedWord> relatedWords = new ArrayList<>();
        myWords.forEach(item->{
            relatedWords.add(myWord2RelatedWord(item,word));
        });
        return relatedWords;
    }
    public static RelatedWord myWord2RelatedWord(MyWord myWord,String word){
        String[] words = myWord.getWords().split(" ");
        String[] highlightWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            highlightWords[i] = words[i].trim().replaceAll(word,"<span style='color: #BF3553'>"+word+"</span>");
        }
        return RelatedWord.builder()
                .id(myWord.getId())
                .searchCount(myWord.getSearchCount())
                .highlightWords(highlightWords)
                .words(words).build();
    }
}
