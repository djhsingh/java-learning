package djh.learn.java19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/myfile.txt";
    public static void main(String[] args) throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath,true)) {
            String name = "Java is Awsome";
            fileOutputStream.write(name.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(name.getBytes(StandardCharsets.UTF_8), 5, name.length()-5);
            fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
        }

        FileInputStream fileInputStream  = new FileInputStream(filePath);
        byte[] data = fileInputStream.readAllBytes();
        String myData = new String(data);
        System.out.println(myData);
    }
}