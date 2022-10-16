package demo3;

public class TestPerform {
    public static void main(String[] args) {
        int N = 9999;
        long t;


        StringBuffer sbr = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbr.append("something");
        }
        System.out.println(System.currentTimeMillis() - t);

        StringBuilder sbl = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbl.append("something");
        }
        System.out.println(System.currentTimeMillis() - t);
    }
}