package com.geekbrains.Lesson_7;

public class HomeWork7 {

    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Барсик", 150);
        cat[1] = new Cat("Мурзик", 100);
        cat[2] = new Cat("Васька", 200);
        cat[3] = new Cat("Боря", 120);
        cat[4] = new Cat("Петя", 200);
        Plate plate = new Plate(200);
            for (Cat i : cat) {
                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и теперь сыт");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
    }
}
