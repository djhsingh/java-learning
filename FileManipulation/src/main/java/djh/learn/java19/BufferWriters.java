package djh.learn.java19;

import java.io.*;

public class BufferWriters {
    static String filePath = "C:/Users/DEEPAK SINGH JANGRA/Downloads/bufferewrit.txt";
    public static void main(String[] args) throws IOException {
        FileWriter outputStream = new FileWriter(filePath);
        BufferedWriter bufferedOutputStream = new BufferedWriter(outputStream);
        String write = "I am using jdk 19";
        String write2 = "I used jdk 18";
        bufferedOutputStream.write(write);
        bufferedOutputStream.write("\n");
        bufferedOutputStream.write(write2);
        bufferedOutputStream.close();

        FileReader inputStream = new FileReader(filePath);
        BufferedReader bufferedInputStream = new BufferedReader(inputStream);

        String line;
        while ((line = bufferedInputStream.readLine())!=null){
            System.out.println(line);
        }

    }
}
