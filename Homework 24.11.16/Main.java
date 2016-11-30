package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyString string = new MyString("Hello");
        System.out.println(string.charAt(5));
        System.out.println(new MyString("Abcdefg"));
        string = string.concatenate(new MyString("World"));
        System.out.println(string);
        System.out.println(string.equals(new MyString("gdfgdfgdsgdf")));
        System.out.println(string.indexOf(new MyString("loW")));
        System.out.println(string.length());
        System.out.println(Arrays.toString(string.split('o')));
        System.out.println(string.substring(0,4));
    }
}
