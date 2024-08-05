package djh.learn.java19;

import java.io.File;
import java.util.Arrays;

public class FileIOS {
    public static void main(String[] args) {
        File dir = new File("fileIO");
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(Arrays.toString(dir.listFiles()));

        traverseDirectory(dir);
    }

    static void traverseDirectory(File dir){
        File[] files = dir.listFiles();
        for (File file:files){
            if(file.isDirectory()){
                System.out.println("dir name is: "+file.getName());
                traverseDirectory(file);
            } else {
                System.out.println("File name is: "+file.getName());
            }
        }
    }
}
