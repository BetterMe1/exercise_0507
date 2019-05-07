package exercise.exercise_0507;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"Users"+File.separator+
                "lenovo"+File.separator+"Desktop"+File.separator+"xiao");
        if(file.exists()){
            listAllFiles(file);
        }else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void listAllFiles(File file){
        if(file != null){
            if(!file.isFile()){
                File[] files = file.listFiles();
                for(File file1 : files){
                    listAllFiles(file1);
                }
            }else{
                System.out.println(file+"  大小:"+file.length()+" 创建时间："
                        +new Date(file.lastModified()));
            }
        }
    }
}
