package djh.learn.java19;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteArrays {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/fileBA.txt";
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
            String name = "Java is Awsome";
            byteArrayOutputStream.writeBytes(name.getBytes(StandardCharsets.UTF_8));
            byteArrayOutputStream.writeBytes("\n".getBytes(StandardCharsets.UTF_8));


        ByteArrayInputStream byteArrayInputStream  = new ByteArrayInputStream(name.getBytes());
        int data ;
       StringBuilder myData= new StringBuilder();
        while((data = byteArrayInputStream.read()) != -1){
            myData.append((char)data);
          //  System.out.println((char)data);
        }
        System.out.println(myData);

    }
}