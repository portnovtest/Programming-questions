package com.string.questions;

public class ExtractStringPart {
    public static void main(String[] args) {
        String str = "www.erostrum.com";
        // www.  --> firstFour
        // .com --> lastFour
        // erostrum

        String firstFour = str.substring(0,4); // endIndex is exclusive
        System.out.println(firstFour);

        String lastFour = str.substring(str.length()-4);
        System.out.println(lastFour);

        String website = str.substring(4, str.length()-4);
        System.out.println(website);
    }
}
