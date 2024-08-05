package djh.learn.java19;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Users","Deepak Singh Jangra","NIO","myFile");
        System.out.println(path.toUri());

        Path path1 = FileSystems.getDefault().getPath("");
        System.out.println(path1.toUri());

        Path pathz = FileSystems.getDefault().getPath("C:/Users/Deepak Singh Jangra/Desktop/NIO");
        Path myPath = Paths.get(pathz.toString(),"nio.txt");
        if(Files.notExists(pathz)){
            System.out.println("No file exist");
            Files.createDirectories(pathz);
        } else {
            System.out.println("File are there.....");
        }

        if(Files.notExists(myPath)){
            Files.createFile(myPath);
        }


    }
}
