package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter workshop name: ");
        String name = scanner.nextLine();

        System.out.print("Enter workshop capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Workshop workshop = new Workshop(name, capacity);

        System.out.print("How many registrations to attempt? ");
        int attempts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < attempts; i++) {

            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            System.out.println(workshop.registerStudent(studentId));
        }

        workshop.displayReport();

        scanner.close();
    }
}
