package ru.geekbrains.lesson7;

public class Cat {

    private String name;
    private int appetite;

    public Cat (String name, int appetite) {

        this.name = name;
        this.appetite = appetite;

    }

    public boolean catEat (PlateWithFood plateWithFood) {
        if (plateWithFood.foodAmount < appetite) {
            System.out.println(name + "у не хватает еды в миске. Кот не ест.");
            return false;
        } else {
            plateWithFood.foodAmount -= appetite;
            System.out.println(name + " поел. Кот сыт.");
            return true;
        }
    }
}
