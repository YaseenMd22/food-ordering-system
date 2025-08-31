package org.food.order.app;

public class FoodFactory {

    public FoodItem getFood(String foodType){

        if(foodType.equalsIgnoreCase("PIZZA")){
            return new Pizza();
        }else{
            return new Burger();
        }

    }
}
