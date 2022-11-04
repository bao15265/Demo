package demo5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        doSth1();
    }

    public static void doSth1(){
        try {
            doSth2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void doSth2() throws InterruptedException, IOException {
        Thread.sleep(1000);
        Files.createFile(Paths.get("myfile.txt"));
    }
}
