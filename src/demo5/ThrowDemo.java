package demo5;

import java.util.Scanner;

public class ThrowDemo {
    public static void checkAge1(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("You must be 18+ to sign up");
            else
                System.out.println("You are now signed up!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        checkAge1(age);
    }
}