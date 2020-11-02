package top.lazyr.myweb.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpParseUtil {

    /**
     * 获取传入英文单词的中文翻译
     * @param word
     * @return
     * @throws IOException
     */
    public static String translateWord(String word) {
        String url = StringParseUtil.getWordUrl(word);
        StringBuffer translation = new StringBuffer();
        Document document = null;
        try {
            document = Jsoup.parse(new URL(url), 10000);
            Elements transContainer = document.getElementsByClass("trans-container");
            Element ul = transContainer.get(0);
            Elements lis = ul.getElementsByTag("li");

            for (Element li:lis) {
                translation.append(li.text()+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            return translation.toString();
        }


    }
}
