package djh.learn.java19;

import java.io.IOException;
import java.nio.file.*;

public class FilesManipulation {
    public static void main(String[] args) throws IOException {
        Path srcPath = Path.of("C://Users/Deepak Singh Jangra/Desktop/Src/myfile.txt");
        Path srcPath1 = Path.of("C://Users/Deepak Singh Jangra/Desktop/Src/file1.pdf");
        Path destpath = Path.of("C://Users/Deepak Singh Jangra/Desktop/Dest/myfile-copy.txt");
        Path destPath2 = Path.of("C://Users/Deepak Singh Jangra/Desktop/Dest/joly.pdf");

         Files.move(srcPath1,destPath2);

         CopyDirectory.copy(srcPath,destPath2);


    }
}
