package demo5;

public class UncheckedExceptionDemo {
    public void testInt(int a, int b) {
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public void isNull(String str) {

        if (str != null) {
            System.out.println(str.toUpperCase());
        }
    }

    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        ued.testInt(4, 0);
        ued.isNull(null);
    }
}
