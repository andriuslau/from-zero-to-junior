package com.juniorjavadeveloper.myscanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        // -> Nuskaitome tekstinę informaciją

//        String fullName = input.nextLine();
//        System.out.println("Full name: " + fullName);
//
//        String firstName = input.next();
//        System.out.println("First name: " + firstName);

        // -> Įvedame skaičius ir atliekame skaičiavimą

//        System.out.println("Enter first number:");
//        int a = input.nextInt();
//        System.out.println("Enter second number:");
//        int b = input.nextInt();
//        System.out.println("Total: " + (a + b));

        // -> Ciklas, kuris nuskaito boolean reikšmę iš konsolės

//        System.out.println("Still active?");
//        boolean isActive = input.nextBoolean();
//
//        while (isActive) {
//            System.out.println("Still active?");
//            isActive = input.nextBoolean();
//        }
//
//        System.out.println("Closing...");

        // -> Nuskaitome failą

        Scanner textReader = new Scanner(Path.of("src/com/juniorjavadeveloper/myscanner/text.txt"));

        while (textReader.hasNext()) {
            System.out.println(textReader.next());
        }
    }
}
