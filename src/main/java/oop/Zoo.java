package oop;

import oop.model.Cat;

/**
 * @author Andrej Reutow
 * created on 06.05.2023
 */
public class Zoo {

    public static void main(String[] args) {
        Animal catTom = new Cat("Vasja", 1, "Black");
        System.out.println(catTom.name);
//        catTom.name = "Tom";
        System.out.println(catTom.name);

        Animal catVasja = new Cat("Vasja", 2, "Black");


        System.out.println(catTom.equals(catVasja));

        String str1 = new String("str1");
        String str2 = new String("str1");

        System.out.println(str2.equals(str1));
        //        Animal chickenRjaba = new Animal("Rjaba", 1) {
//            @Override
//            public void speak() {
//                System.out.println("Ко-ко-ко!");
//            }
//        };
//        chickenRjaba.speak();
//        System.out.println(chickenRjaba.name);
//        System.out.println(chickenRjaba.age);
    }
}
