package ru.geekbrains.lesson7;

public class Homework7 {
    public static void main(String[] args) {

        PlateWithFood catPlate = new PlateWithFood(20);

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик", 15);
        cats[1] = new Cat("Мурзик", 20);
        cats[2] = new Cat("Черныш", 18);
        cats[3] = new Cat("Бегемот", 25);
        cats[4] = new Cat("Леопольд", 12);

        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].catEat(catPlate)){
                catPlate.foodAdd(30);
                i--;
            }
        }

    }
}




