package org.food.order.app;

public class Burger implements FoodItem{
    @Override
    public void prepare() {
        System.out.println("Preparing Burger....");
    }

    @Override
    public String toString(){
        return "Burger";
    }
}
