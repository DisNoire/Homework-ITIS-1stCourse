package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Species:" + human.getName());
        System.out.println("Height:" + human.getHeight());
        System.out.println("Pulse:" + human.getPulse());
        human.run();
        System.out.println("Pulse after running:" + human.getPulse());
        System.out.println(human.shout());
        human.eat();

    }
}
