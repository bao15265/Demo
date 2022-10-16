package demo3;

class Test extends Thread  {
    StringBuffer sbr;

    public Test() {
        sbr = new StringBuffer();
    }

    public String hello() {
        sbr.append("Hello World");
        return(sbr.toString());
    }

    @Override
    public void run() {
        super.run();
    }
}

public class StringBufferDemo {
    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
        Test thread2 = new Test();
        thread2.start();
        System.out.println(thread1.hello());
        System.out.println(thread2.hello());
    }
}

