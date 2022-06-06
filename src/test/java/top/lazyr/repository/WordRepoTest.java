package top.lazyr.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import top.lazyr.model.bo.WordBo;
import top.lazyr.model.po.Word;
import top.lazyr.utils.ObjUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class WordRepoTest {
    @Autowired
    private WordRepo wordRepo;
    @Autowired
    private RelatedWordsRepo relatedWordsRepo;

    @Test
    public void test() {
        Word word = wordRepo.getOne(1l);
        WordBo wordBo = ObjUtils.cast(word, WordBo.class);
        System.out.println(wordBo);
//        System.out.println(relatedWordsRepo.getOne(1l));
    }
}
