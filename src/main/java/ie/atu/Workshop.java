package ie.atu;

import java.util.HashSet;

public class Workshop {

    private String workshopName;
    private int capacity;
    private HashSet<String> registeredStudents;
    private int rejectedAttempts;

    public Workshop(String workshopName, int capacity) {
        this.workshopName = workshopName;
        this.capacity = capacity;
        this.registeredStudents = new HashSet<>();
        this.rejectedAttempts = 0;
    }

    public String registerStudent(String studentId) {

        if (studentId == null || studentId.trim().isEmpty()) {
            rejectedAttempts++;
            return "Invalid student ID.";
        }

        if (registeredStudents.contains(studentId)) {
            rejectedAttempts++;
            return "Already registered.";
        }

        if (registeredStudents.size() >= capacity) {
            rejectedAttempts++;
            return "Workshop full.";
        }

        registeredStudents.add(studentId);
        return "Registration successful.";
    }

    public void displayReport() {

        System.out.println("\n--- Workshop Report ---");
        System.out.println("Workshop: " + workshopName);

        System.out.println("Registered students:");

        for (String id : registeredStudents) {
            System.out.println(id);
        }

        System.out.println("Accepted registrations: "
                + registeredStudents.size());

        System.out.println("Rejected attempts: "
                + rejectedAttempts);

        System.out.println("Places remaining: "
                + (capacity - registeredStudents.size()));
    }
}
