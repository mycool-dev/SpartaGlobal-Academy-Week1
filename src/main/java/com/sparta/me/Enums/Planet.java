package com.sparta.me.Enums;

public enum Planet {
    MERCURY(3,10000),
    VENUS(2,1000);
    int numberOfMoons;
    int mass;

    Planet(int numberOfMoons, int mass) {
        this.numberOfMoons = numberOfMoons;
        this.mass = mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
