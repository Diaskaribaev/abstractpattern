package com.company;

public class Main {

    public static void main(String[] args) {
	CharacterFactory factory = new StrongFactory();
    Character strongMage = factory.makeMage();

    System.out.println(strongMage.name+" "+strongMage.life);
    System.out.println("----------------------------");
    CharacterFactory factory1 = new WeakFactory();
    Character weakMage= factory1.makeMage();
    System.out.println(weakMage.name+" "+weakMage.life);
    }
}
