package top.lazyr.myweb.util;

import java.io.*;

public class FileUtil {
    public static String readFileByLine(String path){
        File file = new File(path);
        BufferedReader reader = null;
        StringBuffer content = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            int line = 1;
            String temp = null;
            while ((temp = reader.readLine()) != null){
                content.append(temp+"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("文件"+file.getName()+"读取完毕");
            return content.toString();
        }


    }



    public static void writeFile(String path,String content){
        File file = new File(path);
        FileWriter writer = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file);
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("文件"+file.getName()+"写入完毕");
        }
    }
}
