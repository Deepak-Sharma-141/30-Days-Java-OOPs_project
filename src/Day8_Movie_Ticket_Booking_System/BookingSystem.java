package Day8_Movie_Ticket_Booking_System;

import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setup Theater & Movies
        Theater theater = new Theater("Inox Cinema", 10);
        theater.addMovie(new Movie("Avengers: Endgame", 180, 300));
        theater.addMovie(new Movie("Inception", 150, 250));
        theater.addMovie(new Movie("The Dark Knight", 165, 280));

        // User Registration
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n Welcome to " + theater.getClass().getSimpleName());
            System.out.println("1. Show Movies");
            System.out.println("2. Show Seats");
            System.out.println("3. Book Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    theater.showMovies();
                    break;

                case 2:
                    theater.showSeats();
                    break;

                case 3:
                    theater.showMovies();
                    System.out.print("Choose Movie (1-" + 3 + "): ");
                    int movieChoice = scanner.nextInt();
                    Movie selectedMovie = theater.getMovie(movieChoice - 1);
                    if (selectedMovie == null) {
                        System.out.println(" Invalid Movie Selection!");
                        break;
                    }
                    theater.showSeats();
                    System.out.print("Choose Seat Number: ");
                    int seatNumber = scanner.nextInt();
                    user.bookTicket(theater, selectedMovie, seatNumber);
                    break;

                case 4:
                    exit = true;
                    System.out.println(" Thank you for using the Movie Ticket Booking System!");
                    break;

                default:
                    System.out.println("❌ Invalid Choice!");
            }
        }

        scanner.close();
    }
}