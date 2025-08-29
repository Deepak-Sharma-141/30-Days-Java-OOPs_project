package Day6_Restaurant_Ordering_System;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order(){
        this.items=new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
        System.out.println(item.getName()+" added to order.");
    }

    public double calculateTotal(){
        double total =0;
        for(MenuItem item : items){
            total =total +item.getPrice();
        }
        return total;
}

public void showOrder(){
    System.out.println("Your order:");
    for(MenuItem item : items){
        System.out.println("- "+item.getName()+": $"+item.getPrice());
    }
    System.out.println("Total: $"+calculateTotal());
}

}
