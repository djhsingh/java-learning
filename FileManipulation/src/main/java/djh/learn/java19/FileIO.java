package djh.learn.java19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String desktopPath="C:/Users/DEEPAK SINGH JANGRA/Music";
      //  File file = new File(desktopPath,"/fileIO/Lecture1");//absolute Path
        File file = new File("fileIO/Lecture1");//relative Path

        if(!file.isDirectory()){
            file.mkdirs();
            System.out.println("Directory created...");
        }

        File newFile = new File("fileIO/Lecture1/newfile.txt");//relative Path
        if(newFile.createNewFile()){
            System.out.println("File created");
        }

        System.out.println(newFile.getAbsoluteFile());
        System.out.println(newFile.getAbsolutePath());
        System.out.println(newFile.getParentFile());
        System.out.println(newFile.getParent());
        System.out.println(newFile.getCanonicalFile());
        System.out.println(newFile.getCanonicalPath());
        System.out.println(newFile.getFreeSpace());
        System.out.println(newFile.getName());
        System.out.println(newFile.getPath());
        System.out.println(newFile.getTotalSpace());
        System.out.println(newFile.getUsableSpace());
        System.out.println(newFile.isFile());
        System.out.println(newFile.isDirectory());
        System.out.println(newFile.exists());
        System.out.println(newFile.isHidden());
        System.out.println(new Date(newFile.lastModified()));

        newFile.setWritable(true);
        try(FileWriter writer = new FileWriter(newFile)){
            writer.write("welcome to java19");
        }

    }
}
