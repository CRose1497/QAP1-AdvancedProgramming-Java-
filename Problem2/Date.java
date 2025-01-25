// Date.java.
package Problem2;

public class Date {
    private int day;   // Day of the month [1, 31].
    private int month; // Month of the year [1, 12].
    private int year;  // Year [1900, 9999].

    // Constructor to initialize day, month, and year.
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters.
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setters.
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Set all date fields at once.
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // toString method to format the date as "dd/mm/yyyy".
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
