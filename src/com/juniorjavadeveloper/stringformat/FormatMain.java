package com.juniorjavadeveloper.stringformat;

public class FormatMain {
    public static void main(String[] args) {

        String name = "Doe";
        String lastName = "Smith";
        int number = 5;
        double doubleNumber = 5.26373;
        boolean isNew = true;

//        System.out.println(String.format("Client name %s", name));
//
//        String formattedString = String.format("Client name %s, client id %d, is client new - %b", name, number, isNew);
//        System.out.println(formattedString);
//
//        String formattedString2 = String.format("Client name %s, amount %.2f", name, doubleNumber);
//        System.out.println(formattedString2);
//
//        String formattedString3 = String.format("Client name %2$.2f, amount %1$s and %2$.5f", name, doubleNumber);
//        System.out.println(formattedString3);
//
//        String fName2 = "DoeDoeDoe";
//        String lName2 = "SmithSmith";
//
//        String formattedString4 = String.format("%-30s %s", name, lastName);
//        String formattedString5 = String.format("%-30s %s", fName2, lName2);
//        System.out.println(formattedString4);
//        System.out.println(formattedString5);

        System.out.printf("Client name is %s and %nhis last name is %s", name, lastName);
    }
}
