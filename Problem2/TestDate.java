// TestDate.java.
package Problem2;

public class TestDate {
    public static void main(String[] args) {
        // Create a Date object.
        Date date = new Date(25, 1, 2025);

        // Print the date using the toString method.
        System.out.println("Initial Date: " + date);

        // Modify the date fields.
        date.setDay(15);
        date.setMonth(12);
        date.setYear(2023);

        // Print the updated date.
        System.out.println("Updated Date: " + date);

        // Set a completely new date.
        date.setDate(1, 1, 2024);

        // Print the final date.
        System.out.println("Final Date: " + date);
    }
}
