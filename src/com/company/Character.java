package com.company;

public abstract class Character {
    private String name;
    private int hitPoint;
    private int agility;
    private int baseAttack;
    private int defence;
    private String imageLocation;
    public Character(String name,int hitPoint, int agility, int baseAttack, int defence, String imageLocation)
    {
        this.name = name;
        this.hitPoint=hitPoint;
        this.agility= agility;
        this.defence =defence;
        this.baseAttack = baseAttack;
        this.imageLocation = imageLocation;
    }

    public void setProperty()
    {
        this.hitPoint = (int)(Math.random()*100+1);
        this.agility = (int)(Math.random()*100+1);
        this.defence = (int)(Math.random()*100+1);
        this.baseAttack=(int)(Math.random()*100+1);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBaseaAttack() {
        return baseAttack;
    }

    public void setBaseaAttack(int baseaAttack) {
        this.baseAttack = baseaAttack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
