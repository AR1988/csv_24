package oop.model;

import oop.Animal;
import oop.IAnimal;

/**
 * @author Andrej Reutow
 * created on 06.05.2023
 */
public class Cat extends Animal implements IAnimal {

    private String color;

    private EatType eatType;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        eatType = EatType.MEAT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat that = (Cat) o;
        return this.color.equals(that.color)
                && this.age == that.age
                && this.name.equals(that.name);
    }
    public class Eat {
        private boolean isMeat;
    }

    private enum EatType {
        MEAT
    }

}
