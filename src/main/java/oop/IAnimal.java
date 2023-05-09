package oop;

/**
 * @author Andrej Reutow
 * created on 06.05.2023
 */
public interface IAnimal {

    public static final String someVar = "asdasd";

    void eat();

    default void print() {
        System.out.println("Print from Interface");
    }
}
