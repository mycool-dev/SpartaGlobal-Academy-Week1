package com.sparta.me.SOLID.L;

public class App {
    public static void main(String[] args) {
        FlyingBird eagle = new Eagle("Eagle");
        FlyingBird falcon = new Falcon("Falcon");
        NonFlyingBird ostrich = new Ostrich("Falcon");
        FlyingBird[] birds = {eagle, falcon};

        for (FlyingBird bird : birds) {
            System.out.println(bird.fly());
        }
    }
}
