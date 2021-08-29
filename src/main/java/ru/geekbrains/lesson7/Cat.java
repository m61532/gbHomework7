package ru.geekbrains.lesson7;

import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return appetite == cat.appetite && satiety == cat.satiety && Objects.equals(name, cat.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, appetite, satiety);
//    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }
}
