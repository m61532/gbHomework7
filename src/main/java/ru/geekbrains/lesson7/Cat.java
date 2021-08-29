package ru.geekbrains.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name, int appetite) {

        this.name = name;
        this.appetite = appetite;

    }

    public boolean catEat (PlateWithFood plateWithFood) {
        if (plateWithFood.foodAmount < appetite) {
            System.out.println(name + "у не хватает еды в миске. Кот не ест.");
            return satiety = false;
        } else {
            plateWithFood.foodAmount -= appetite;
            System.out.println(name + " поел. Кот сыт.");
            return satiety = true;
        }
    }
}
