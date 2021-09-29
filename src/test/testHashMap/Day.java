package test.testHashMap;

import java.util.Objects;

public class Day {
    private int year;
    private int month;
    private int day;

    public Day() {
    }

    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Day{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        return year == day1.year &&
                month == day1.month &&
                day == day1.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
