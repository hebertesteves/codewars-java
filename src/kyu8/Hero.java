package kyu8;

public class Hero {
    public String name;
    public String position;
    public int health;
    public int damage;
    public int experience;

    public Hero() {
        this.name = "Hero";
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }

    public Hero(String name) {
        this.name = name;
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero.health);
    }
}


