package com.geekbrains.Lesson_7;

public class Cat {

    private final String name;
    private final int appetite;
    private final int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatiety() {
        return satiety;
    }

    Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

