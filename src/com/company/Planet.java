package com.company;

public class Planet {
    public static void main(String[] args) {
        Human human1 =new Human();
        human1.eyeColor = "blue";
        Human human2 = null;
        human2 = new Human();
        human2.eyeColor = "green";
        Human human3 = new Human("brown", 39,75);
        System.out.println(human3.footSize);
//        human3.eat();
//        System.out.println(human3.hungry);
        Human randi = new Human("blue",1,1);
        human3.gyertyaFenyesVacsora(randi);
        System.out.println(randi.weight);
        System.out.println(human3.weight);
    }

}
