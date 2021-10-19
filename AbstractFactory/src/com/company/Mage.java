package com.company;

public class Mage extends Character{

    Mage(String name, int life) {
        this.name = name;
        this.life = life;
    }

    @Override
    public int shotsPerSecond() {
        return 5;
    }

}
