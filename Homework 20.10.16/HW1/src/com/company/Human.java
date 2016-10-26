package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class Human extends Monkey{
    String name = "Homo sapiens";

    @Override
    public String shout() {
        return "Hello, world!";
    }

    @Override
    public String getName() {
        return name;
    }
}
