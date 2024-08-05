package djh.learn.java19;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ListingFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C://Users/Deepak Singh Jangra/Desktop/DjH");
        try(Stream<Path> files = Files.list(path)) {
            files.forEach(f -> System.out.println(f.getFileName()));
        //   files.forEach(System.out::println);
        }

        try(Stream<Path> files = Files.walk(path)) {
           // files.forEach(f -> System.out.println(f.getFileName()));
           //   files.forEach(System.out::println);
            List<Path> pathList = files.filter(f-> f.toString().endsWith("pdf")).toList();
            System.out.println(pathList);
        }
        System.out.println("-------------------");

    }
}
