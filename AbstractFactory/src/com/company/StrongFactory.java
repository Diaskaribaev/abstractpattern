package com.company;

public class StrongFactory implements CharacterFactory {

    @Override
    public Warrior makeWarrior() {
        return new Warrior("Strong Warrior", 200);
    }

    @Override
    public Mage makeMage() {
        return new Mage("Strong Mage", 250);
    }

}
