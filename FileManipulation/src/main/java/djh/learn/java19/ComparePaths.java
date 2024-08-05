package djh.learn.java19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ComparePaths {
    public static void main(String[] args) {
        Path path1 = Paths.get("NIO/compare/paths/folder1");
        Path path2 = Paths.get("NIO/compare/paths/folder1");
        Path path3 = Paths.get("NIO/compare/paths/folder1/folder2/person.txt");

        Path path4 = path3.subpath(4,6);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path4);
        System.out.println(path1.equals(path2));
        System.out.println(path1.equals(path3));
        System.out.println(path1.equals(path4));
        System.out.println(path3.startsWith(path1));
        System.out.println(path3.startsWith(path4));

    }
}
