package com.geekbrains.Lesson_7;

public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.println(name + " съел " + appetite + " грамм корма");
        plate.decreaseFood(appetite);
    }

}

