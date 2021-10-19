package com.company;

public class WeakFactory implements CharacterFactory {

    @Override
    public Warrior makeWarrior() {
        return new Warrior("Weak Warrior", 50);
    }

    @Override
    public Mage makeMage() {
        return new Mage("Weak Mage", 75);
    }

}
