package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setDefense("Heavyweight");
        System.out.println("Здоровья Босса " + boss.getHealth() + " урон " + boss.getDamage() + " тип защиты " +
                "" + boss.getDefense());
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Урон "+createHeroes()[i].getDamage() + " Здоровья " + createHeroes()[i].getHealth());
        }
    }

    public static Hero[] createHeroes() {
        Hero raiden = new Hero(20, 150);
        raiden.setDamage(20);
        raiden.setHealth(150);
        Hero kitana = new Hero(27, 100);
        kitana.setDamage(27);
        kitana.setHealth(100);
        Hero sab_Zero = new Hero(25, 140);
        sab_Zero.setHealth(140);
        sab_Zero.setDamage(25);
        return new Hero[] {raiden, kitana, sab_Zero};
    }

}