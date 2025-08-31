package Day8_Movie_Ticket_Booking_System;

import java.util.ArrayList;
import java.util.List;

class Theater {
    private String name;
    private List<Movie> movies;
    private List<Seat> seats;

    public Theater(String name, int totalSeats) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void showMovies() {
        System.out.println("\nAvailable Movies in " + name + ":");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print((i + 1) + ". ");
            movies.get(i).displayInfo();
        }
    }

    public Movie getMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            return movies.get(index);
        }
        return null;
    }

    public void showSeats() {
        System.out.println("\nSeats Status:");
        for (Seat seat : seats) {
            System.out.print(seat.getSeatNumber() + (seat.isBooked() ? " [X]  " : " [Available]  "));
        }
        System.out.println();
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= seats.size()) {
            Seat seat = seats.get(seatNumber - 1);
            if (!seat.isBooked()) {
                seat.book();
                return true;
            }
        }
        return false;
    }
}
