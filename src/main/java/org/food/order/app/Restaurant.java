package org.food.order.app;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    List<FoodItem> menu = new ArrayList<>();
    public void addMenuItem(FoodItem item){
//        List<FoodItem> menu = new ArrayList<>();
        menu.add(item);
//        return menu;
    }

    public void showMenu(){

        System.out.println("Restaurant Menu:");

        for(FoodItem item: menu){
            System.out.println(item);
        }

    }
}
