package Day8_Movie_Ticket_Booking_System;

// User Class
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void bookTicket(Theater theater, Movie movie, int seatNumber) {
        if (theater.bookSeat(seatNumber)) {
            System.out.println("\nBooking Successful!");
            System.out.println("User: " + name);
            System.out.println("Movie: " + movie.getTitle());
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Amount Paid: ₹" + movie.getPrice());
        } else {
            System.out.println("\nSeat " + seatNumber + " is already booked. Please try another seat.");
        }
    }
}
