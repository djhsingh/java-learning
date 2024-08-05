package djh.learn.java19;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriters {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/fileWR.txt";
    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter(filePath,true)) {
            String name = "Java is Awsome";
            fileWriter.write(name);
            fileWriter.write("\n");
        }

        FileReader fileReader  = new FileReader(filePath);
        int data ;
       StringBuilder myData= new StringBuilder();
        while((data = fileReader.read()) != -1){
            myData.append((char)data);
          //  System.out.println((char)data);
        }
        System.out.println(myData);

    }
}