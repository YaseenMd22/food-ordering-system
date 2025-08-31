package org.food.order.app;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    List<FoodItem> menu = new ArrayList<>();
    public void addMenuItem(FoodItem item){
        menu.add(item);
    }

    public void showMenu(){

        System.out.println("Restaurant Menu:");

        int count =1;
        for(FoodItem item: menu){
            System.out.println(count + ". "+ item);
            count++;
        }
    }
}
