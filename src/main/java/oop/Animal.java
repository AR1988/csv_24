package oop;

/**
 * @author Andrej Reutow
 * created on 06.05.2023
 */
public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public abstract void speak();

}
