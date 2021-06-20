package com.juniorjavadeveloper.stringmethods;

public class StringMain {
    public static void main(String[] args) {

        String name = "joe";
        String lastName = "Doe";
        String sentence = "Perfect weather for cycling";
        //                 012.......................26
        String empty = "";

//        System.out.println(name.toUpperCase());
//        System.out.println(lastName.toLowerCase());
//        System.out.println(name.concat(lastName));
//        System.out.println(sentence.length());
//        System.out.println(name.charAt(name.length() - 1));
//        System.out.println(sentence.contains("ht"));
//        System.out.println(name.equalsIgnoreCase("JoE"));
//        System.out.println(name.equals("Joe"));
//        System.out.println(sentence.startsWith("Pert"));
//        System.out.println(sentence.endsWith("ingi"));
//        System.out.println(sentence.indexOf("e"));
//        System.out.println(sentence.lastIndexOf("e"));
//        System.out.println(empty.isEmpty());
//        System.out.println(empty.isBlank());
//        System.out.println(sentence.replace("e", "o"));
//        System.out.println(sentence.substring(8));

        String random = "     Name and Lastname     ";
        System.out.println(random);
        System.out.println(random.trim());
        System.out.println(random.strip());
    }
}
