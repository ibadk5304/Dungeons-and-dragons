package com.company;

public class Monster extends Character {
    private boolean strenthorspecllcast;
    public Monster(String name, int hitPoint, int agility, int defence, int baseAttack, String imageLocation, boolean strengthorspecllcast)
    {
        super(name,hitPoint,agility,defence,baseAttack,imageLocation);
        this.strenthorspecllcast=strengthorspecllcast;

    }
}
