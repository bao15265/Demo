package demo5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        try {
            Files.createFile(Paths.get("myfile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
