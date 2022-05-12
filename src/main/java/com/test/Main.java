package com.test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();

        System.out.println("The key sequence is: " + App.press(word));
        keyboard.close();

    }
}
