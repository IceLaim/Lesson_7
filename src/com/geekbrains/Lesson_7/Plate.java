package com.geekbrains.Lesson_7;

public class Plate {

    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("Текущее кол-во еды " + foodQuantity + " грамм");
    }

    public void decreaseFood(int foodQuantity) {
        this.foodQuantity -= foodQuantity;
    }
}

