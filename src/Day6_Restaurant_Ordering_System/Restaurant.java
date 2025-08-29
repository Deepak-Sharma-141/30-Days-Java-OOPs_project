package Day6_Restaurant_Ordering_System;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<MenuItem> menu;

    public Restaurant(String name){
        this.name=name;
        this.menu=new ArrayList<>();
    }

    public void addMenuItem(MenuItem item){
        menu.add(item);
    }

    public void showMenu(){
        System.out.println(name+" Menu");
        for(MenuItem item : menu){
            System.out.println("- "+item.getName()+": $ "+item.getPrice());
        }
    }
    public List<MenuItem> getMenu(){
        return menu;
    }
}
