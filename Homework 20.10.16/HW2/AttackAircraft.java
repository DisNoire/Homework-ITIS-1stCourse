package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class AttackAircraft extends  Bomber {
    int armour = 100;
    int amountOfRockets = 0;

    public AttackAircraft(String name, int maxVelocity) {
        super(name, maxVelocity);
    }

    @Override
    public void attack() {
        super.attack();
        this.amountOfRockets -= 1;
    }

    @Override
    public String toString() {
        return "This is " + this.name + " with max velocity " + this.maxVelocity + " and " + this.amountOfBombs +
                " bombs and " + this.amountOfRockets + " rockets";
    }
}
