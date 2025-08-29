package org.food.order.app;

public class Pizza implements FoodItem{


    @Override
    public void prepare() {
        System.out.println("Preparing pizza.....");
    }

    @Override
    public String toString(){
        return "Pizza";
    }
}
