package djh.learn.java19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOMethods {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("users","nio","methods");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());
        Path filePath = Paths.get(path.toString(),"nio.txt");
        Files.createDirectories(path);
        Files.createFile(filePath);
        System.out.println(filePath.toAbsolutePath());
        System.out.println(filePath.getFileName());
        System.out.println(filePath.toFile().exists());
        System.out.println(filePath.toFile().isFile());
        System.out.println(path.toFile().isFile());

        BasicFileAttributes attributes = Files.readAttributes(filePath,BasicFileAttributes.class);
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.creationTime());
        System.out.println(attributes.lastModifiedTime());
        System.out.println(attributes.lastAccessTime());
    }
}
