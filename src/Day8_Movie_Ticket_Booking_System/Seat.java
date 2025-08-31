package Day8_Movie_Ticket_Booking_System;

// Seat Class
class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void book() {
        this.isBooked = true;
    }
}