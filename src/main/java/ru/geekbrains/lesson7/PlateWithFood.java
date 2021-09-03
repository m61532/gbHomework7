package ru.geekbrains.lesson7;

public class PlateWithFood {

    public int foodAmount;

    public PlateWithFood() {
        this.foodAmount = 50;
    }

    public PlateWithFood(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void foodAdd(int foodAmount) {
        this.foodAmount += foodAmount;
        System.out.println("\nВ миску добавлено "+ foodAmount + " единиц еды.\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlateWithFood)) return false;
        PlateWithFood that = (PlateWithFood) o;
        return foodAmount == that.foodAmount;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(foodAmount);
//    }

    @Override
    public String toString() {
        return "Количество еды в этой тарелке " + foodAmount;
    }
}