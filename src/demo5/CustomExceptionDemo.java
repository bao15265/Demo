package demo5;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void checkAge2(int age) {
        if (age < 18) {
            throw new AgeException("jdakdjalkdada");
        } else {
            System.out.println("You are now signed up!");
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        try {
            checkAge2(age);
        } catch (RuntimeException e) {
            System.out.println("??????");
        }

    }

}