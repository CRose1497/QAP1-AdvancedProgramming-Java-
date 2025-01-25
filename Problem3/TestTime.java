// TestTime.java.
package Problem3;

public class TestTime {
    public static void main(String[] args) {
        // Create two time objects.
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display the initial times.
        System.out.println("Initial Times:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

        // Change time using nextSecond() and previousSecond().
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times.
        System.out.println("\nFinal Times:");
        System.out.println("Time 1 (after nextSecond): " + t1);
        System.out.println("Time 2 (after previousSecond): " + t2);
    }
}
