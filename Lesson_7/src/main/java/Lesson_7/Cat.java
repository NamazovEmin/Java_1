package Lesson_7;

import java.util.SortedMap;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite, boolean full) {
        this.appetite = appetite;
        this.name = name;
        this.full = full;
    }

    public void catEat(Dish d) {
        if (!full) {
            if (!d.foodDecrease(appetite)) {
                System.out.println(name + " остался голодный и это " + full);
            } else {
                full = true;
                System.out.println(name + " Наелся и это " + full);
            }
        }else{
            System.out.println(name + " не покушал, т.к. он не голодный и это " + full);
        }
    }
}



