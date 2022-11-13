package demo1;

public class Random {
    public static void main(String[] args) {
        int num;
        for (int i = 0; i < 3; i++) {
            num = (int) (Math.random() * 100);
            while (num % 2 != 0) {
                num = (int) (Math.random() * 100);
            }
            System.out.println(num);
        }
    }
}
