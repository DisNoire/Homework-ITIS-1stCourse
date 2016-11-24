package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class Monkey {
    int pulse = 70;
    int height = 180;
    String name = "Homo";

    public String shout(){
        return "*Monkey scream*";
    }

    public void run(){
        pulse += 50;
    }

    public void eat(){
        System.out.println("*satisfying scream*");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getHeight() {
        return height;
    }

    public int getPulse() {
        return pulse;
    }

    public String getName() {
        return name;
    }
}
