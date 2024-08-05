package djh.learn.java19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class NIOReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("learn","readAndWrite","nio","files");
        Path filePath = Paths.get(path.toString(),"myfile.txt");
        Files.createDirectories(path);
        if(Files.notExists(filePath)){
            Files.createFile(filePath);
        }
        String data = "This is java.nio.file path api learning";
        List<String> list = List.of("item 1","item 2","item 3");
      /*  Files.write(filePath,data.getBytes(), StandardOpenOption.APPEND);
        Files.write(filePath,list,StandardOpenOption.APPEND);
*/
        try(OutputStream outputStream = Files.newOutputStream(filePath)){
            list.forEach(item-> {
                try {
                    outputStream.write(item.toString().getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        String file  = Files.readString(filePath);
        System.out.println(file);

    }
}
