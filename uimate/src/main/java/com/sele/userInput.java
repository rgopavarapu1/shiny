package com.sele;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s , how old are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("As you are %d, you are qualified to apply. What do you intend to apply for? ", age);
        String visaType = scanner.nextLine();

        System.out.printf("%s is eligible for your age. Please continue.", visaType);

        scanner.close();
    }

}
