package Hotel_booking;
//public class Hotel {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.util.Scanner;

public class Hotel {
    // Initialize rooms
    static boolean[][] rooms = new boolean[5][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nWelcome to the Hotel Booking System!");
            System.out.println("1. Search for available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchForAvailableRooms();
                    break;
                case 2:
                    bookARoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }

    public static void searchForAvailableRooms() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();

        System.out.print("Enter the check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();

        System.out.println("\nAvailable rooms:");

        // Loop through all rooms and check availability
        for (int floor = 0; floor < 5; floor++) {
            for (int roomNumber = 0; roomNumber < 10; roomNumber++) {
                if (!rooms[floor][roomNumber]) {
                    System.out.printf("Floor %d, Room %d\n", floor + 1, roomNumber + 1);
                }
            }
        }
    }

    public static void bookARoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();

        System.out.print("Enter the check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();

        System.out.print("Enter the floor number (1-5): ");
        int floor = scanner.nextInt();

        System.out.print("Enter the room number (1-10): ");
        int roomNumber = scanner.nextInt();

        // Check if room is available
        if (!rooms[floor - 1][roomNumber - 1]) {
            rooms[floor - 1][roomNumber - 1] = true;
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Sorry, that room is already booked.");
        }
    }

    public static void cancelBooking() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the floor number of the room to cancel (1-5): ");
        int floor = scanner.nextInt();

        System.out.print("Enter the room number of the room to cancel (1-10): ");
        int roomNumber = scanner.nextInt();

        // Check if room is already booked
        if (rooms[floor - 1][roomNumber - 1]) {
            rooms[floor - 1][roomNumber - 1] = false;
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Sorry, that room is not currently booked.");
        }
    }
}
       
