package oop.model;

import oop.Animal;
import oop.IAnimal;

/**
 * @author Andrej Reutow
 * created on 06.05.2023
 */
public class Dog extends Animal implements IAnimal {
//    public Dog(String name, int age) {
//        super(name, age);
//    }

    @Override
    public void speak() {
        System.out.println("Гаф");
    }

    @Override
    public void eat() {

    }
}
