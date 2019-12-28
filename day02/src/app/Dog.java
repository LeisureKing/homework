package app;

import java.util.Random;

public class Dog extends Animal {

    

    @Override
    public void eat() {
        System.out.println("dog eat food");

    }

    @Override
    public void bite(Animal animal) {
        Random random = new Random();
        int r = random.nextInt(2);
        while (this.weight > 0 && animal.weight > 0) {
            if (r == 0) {
                r = random.nextInt(30);
                if (r != 0) {
                    animal.weight = animal.weight - r;
                    System.out.println(this.name + "成功咬了" + animal.name + r + "滴血，" + "还剩余"
                            + animal.weight + "滴血！");
                } else {
                    System.out.println(this.name + "没咬到！");
                }
            } else {
                r = random.nextInt(30);
                if (r != 0) {
                    this.weight = this.weight - r;
                    System.out.println(animal.name + "成功咬了" + this.name + r +"滴血，" + "还剩余"
                            + this.weight + "滴血！");
                } else {
                    System.out.println(animal.name + "没咬到！");
                }
            }
            r = random.nextInt(2);
        }
        if (animal.weight <= 0) {
            System.out.println(this.name + "咬死了" + animal.name + "!");
        }
        if (this.weight <= 0) {
            System.out.println(animal.name + "咬死了" + this.name + "!");
        }

    }

    public Dog(String name, int weight) {
        super(name, weight);
    }

}