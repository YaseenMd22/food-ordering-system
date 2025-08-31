package org.food.order.app;

public class Main {
    public static void main(String[] args) {

        System.out.println(":::::::::Food Ordering App:::::::");

        Restaurant restaurant = new Restaurant();

        FoodFactory foodFactory = new FoodFactory();
        FoodItem pizza = foodFactory.getFood("PIZZA");
        FoodItem burger = foodFactory.getFood("BURGER");

        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(burger);

        restaurant.showMenu();

        Customer customer = new Customer();
        customer.placeOrder("PIZZA", restaurant);
    }
}