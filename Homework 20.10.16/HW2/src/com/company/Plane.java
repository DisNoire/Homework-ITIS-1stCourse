package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class Plane {
    int amountOfBullets = 1000;
    int maxVelocity;
    String name;

    public Plane(String name, int maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void fly(){}
    public void attack(){
        this.amountOfBullets -= 100;
    }

    @Override
    public String toString() {
        return "This is " + this.name + " with max velocity " + this.maxVelocity;
    }

    public boolean equals(Plane plane) {
        boolean b = false;
        if (this.name.equals(plane.name) && this.maxVelocity == plane.maxVelocity) b = true;
        return b;
    }

    @Override
    public int hashCode() {
        return this.maxVelocity/3;
    }

    @Override
    protected Plane clone(){
        return new Plane(this.name,this.maxVelocity);
    }
}
