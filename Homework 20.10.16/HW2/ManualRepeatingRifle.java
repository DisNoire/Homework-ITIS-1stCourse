package com.company;

/**
 * Created by ENOT on 23.10.2016.
 */
public class ManualRepeatingRifle extends Flintlock {
    int amountOfAmmo = 0;
    int accuracy = 80;

    public ManualRepeatingRifle(int amountOfAmmo) {
        super(amountOfAmmo);
    }

    public void setAmountOfAmmo(int amountOfAmmo) {
        this.amountOfAmmo = amountOfAmmo;
    }

    @Override
    protected ManualRepeatingRifle clone(){
        return new ManualRepeatingRifle(this.accuracy);
    }
}
