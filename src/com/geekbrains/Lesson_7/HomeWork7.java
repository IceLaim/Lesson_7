package com.geekbrains.Lesson_7;

public class HomeWork7 {

    public static void main(String[] args) {
        Cat cat = new Cat("Max", 10);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}

