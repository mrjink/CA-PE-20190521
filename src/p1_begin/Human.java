package p1_begin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {
    String name;
    int age;
    List<Human> children;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        children = new ArrayList<>();
    }

    public void addChild(Human human) {
        children.add(human);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" (").append(age).append(")\n");
        for (Human child : children) {
            stringBuilder.append(child);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Human opa = new Human("Opa", 80);
        Human gillis = new Human("Gillis", 41);
        opa.addChild(gillis);
        Human ziggy = new Human("Ziggy", 17);
        Human yuna = new Human("Yuna", 12);
        gillis.addChild(ziggy);
        gillis.addChild(yuna);

        Human mathijs = new Human("Mathijs", 28);
        Human reinier = new Human("Reinier", 26);
        Human suzanne = new Human("Suzanne", 26);
        Human hassan = new Human("Hassan", 40);
        Human martijn = new Human("Martijn", 40);

        Human[] mensen = new Human[6];
        mensen[0] = gillis;
        mensen[1] = mathijs;
        mensen[2] = reinier;
        mensen[3] = suzanne;
        mensen[4] = hassan;
        mensen[5] = martijn;

        System.out.println(mensen[new Random().nextInt(mensen.length)].name);

        printHumans(mensen);
    }

    private static void printHumans(Human... humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
