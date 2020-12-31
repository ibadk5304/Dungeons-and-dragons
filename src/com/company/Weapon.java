package com.company;

public class Weapon {
    private String name;
    private String description;
    private int attackModifier;
    private int weight;
    private String imageLocation;
    public Weapon(String name, String description, int attackModifier, int weight,String imageLocation)
    {
        this.name=name;
        this.description=description;
        this.attackModifier=attackModifier;
        this.weight=weight;
        this.imageLocation= imageLocation;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public int getWeight() {
        return weight;
    }
}
