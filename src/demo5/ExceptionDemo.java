package demo5;

public class ExceptionDemo {
    private String str;

    public static boolean isNull(String str) {
        try {
            str.toUpperCase();
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] list = {"java", "method", null, " ", "string", "01345"};
        for (String s : list) {
            if (isNull(s)) {
                System.out.println(s.concat(" ok"));
            }
        }
    }
}
