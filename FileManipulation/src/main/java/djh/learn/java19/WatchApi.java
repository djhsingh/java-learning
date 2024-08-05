package djh.learn.java19;

import java.io.IOException;
import java.nio.file.*;

public class WatchApi {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello welcome to watch api");
        try(WatchService watchService = FileSystems.getDefault().newWatchService()){
            Path path = Paths.get("C://Users/Deepak Singh Jangra/Desktop/watch");
            path.register(watchService,StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_DELETE);
            WatchKey key = watchService.take();
            do {
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("Event kind is:" + event.kind());
                    System.out.println("Context kind is:" + event.context());
                    System.out.println("Count kind is:" + event.count());
                }
            }while(key.reset());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
