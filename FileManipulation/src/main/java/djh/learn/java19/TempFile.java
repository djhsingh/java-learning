package djh.learn.java19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempFile {
    public static void main(String[] args) throws IOException {
        Path file = Files.createTempFile("app",null);
        file.toFile();
        System.out.println(file.toFile().getAbsolutePath());
    }

}
