package demo5;

public class Try2Demo {
    public static void main(String args[]) {
        try {
            try {
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception Handling");
        }

        System.out.println("??...");
    }
}