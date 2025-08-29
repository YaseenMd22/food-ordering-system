package org.food.order.app;

public class Customer {

    public void placeOrder(String foodType, Restaurant restaurant){
        System.out.println(" ");
        System.out.println("Customer ordered "+foodType);
        FoodFactory foodFactory = new FoodFactory();
        FoodItem foodItem = foodFactory.getFood(foodType);
        foodItem.prepare();
        System.out.println(foodType+" is ready");
    }
}
