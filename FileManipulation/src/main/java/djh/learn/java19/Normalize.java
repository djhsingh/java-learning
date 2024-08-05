package djh.learn.java19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("NIO","folder1","folder2","normalize");
        Path filePath = Paths.get(path.toString(),"normal.txt");
        System.out.println(filePath.normalize());
        Files.createDirectories(path);
        Path newpath = Paths.get("user","users.txt");
        Path newFilepath = path.resolve(newpath);
      //  Files.createFile(filePath);
      //  Files.createFile(newFilepath);
        System.out.println(newFilepath);

    }
}
