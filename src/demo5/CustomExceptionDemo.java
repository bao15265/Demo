package demo5;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void checkAge2(int age) throws AgeException {
        try {
            if (age < 18) {
                throw new AgeException("You must be 18+ to sign up");
            } else {
                System.out.println("You are now signed up!");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String args[]) throws AgeException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        checkAge2(age);
    }

}