package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class Bomber extends Plane {
    int amountOfBombs = 0;

    public Bomber(String name, int maxVelocity) {
        super(name, maxVelocity);
    }

    public void bomb(){
        this.amountOfBombs -= 1;
    }

    @Override
    public String toString() {
        return "This is " + this.name + " with max velocity " + this.maxVelocity + " and " + this.amountOfBombs + " bombs";
    }
}
