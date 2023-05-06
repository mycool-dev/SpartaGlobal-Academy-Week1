package com.sparta.me.SOLID.L;

//subtypes should be replaceable by their base types

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
