package Day6_Restaurant_Ordering_System;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("Java Bites");

        restaurant.addMenuItem(new MenuItem("Burber",5.99));
        restaurant.addMenuItem(new MenuItem("Pizza",8.99));
        restaurant.addMenuItem(new MenuItem("Pasta",4.49));

        restaurant.showMenu();

        Order order = new Order();
        order.addItem(restaurant.getMenu().get(0));
        order.addItem(restaurant.getMenu().get(2));

        order.showOrder();

    }
}
