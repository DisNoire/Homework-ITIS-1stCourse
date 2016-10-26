package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class Flintlock {
    int amountOfAmmo = 1;
    int accuracy = 50;

    Flintlock(){}

    public Flintlock(int accuracy) {
        this.accuracy = accuracy;
    }

    public void shoot(){
        this.amountOfAmmo -= 1;
    }
    public void clear(){
        this.accuracy += 10;
    }
    public void reload(){
        this.amountOfAmmo += 1;
    }

    @Override
    public String toString() {
        return "This is Flintlock with " + this.amountOfAmmo + "bullet and " + this.accuracy + "% accuracy.";
    }

    public boolean equals(Flintlock flintlock) {
        boolean b = false;
        if (this.amountOfAmmo == flintlock.amountOfAmmo && this.accuracy == flintlock.accuracy) b = true;
        return b;
    }

    @Override
    public int hashCode() {
        return (this.accuracy+this.amountOfAmmo)/2;
    }

    @Override
    protected Flintlock clone(){
        return new Flintlock(this.accuracy);
    }
}
