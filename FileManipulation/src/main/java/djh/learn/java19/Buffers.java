package djh.learn.java19;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Buffers {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/buffer.txt";
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String write = "I am using jdk 19";
        bufferedOutputStream.write(write.getBytes());
        bufferedOutputStream.close();

        FileInputStream inputStream = new FileInputStream(filePath);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int data ;
        while((data = bufferedInputStream.read())!=-1){
            System.out.println((char)data);
        }
        System.out.println(new String(bufferedInputStream.readAllBytes()));

    }
}
