package Day8_Movie_Ticket_Booking_System;

public class Movie {
    private String title;
    private int duration; // in minutes
    private double price;

    public Movie(String title, int duration, double price) {
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("🎬 " + title + " | Duration: " + duration + " mins | Ticket: ₹" + price);
    }
}
