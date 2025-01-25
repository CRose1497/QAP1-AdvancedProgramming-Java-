// Time.java.
package Problem3;

public class Time {
    private int hour;   // Hour [0, 23].
    private int minute; // Minute [0, 59].
    private int second; // Second [0, 59].

    // Constructor to initialize hour, minute, and second.
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters.
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters.
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Advance the time by one second.
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Rewind the time by one second.
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    // toString method to display time in "hh:mm:ss" format.
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
