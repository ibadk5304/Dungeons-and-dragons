package com.company;

public abstract class Player extends Character {
    private String description;
    private Weapon weapon;

    public Player(String name, int hitPoint, int agility,int defence, int baseAttack, String imageLocation,String description,Weapon weapon)
    {
        super(name,hitPoint,agility,defence,baseAttack,imageLocation);
        this.description=description;
        this.weapon=weapon;


    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
