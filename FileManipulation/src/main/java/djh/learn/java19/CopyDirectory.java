package djh.learn.java19;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyDirectory extends SimpleFileVisitor<Path> {

    private Path src,dest;

    public CopyDirectory(Path src, Path dest) {
        this.src = src;
        this.dest = dest;
    }

    public static boolean copy(Path src,Path dest) throws IOException {
        CopyDirectory visiter = new CopyDirectory(src, dest);
        Files.walkFileTree(src,visiter);
        return true;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return super.visitFile(file, attrs);
    }
}
