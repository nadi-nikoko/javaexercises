package javaClass.ObjectedOriented;

import java.util.EnumSet;

public class EnumTypes {

    public static enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    private static final EnumSet<Day> Enumset = null;

    public static void main(String[] args) {

        Day d = Day.MONDAY;

        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> week = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);

        if (weekend.contains(d)) {
            System.out.println("yeah its weekend");
        }
        if (week.contains(d)) {
            System.out.println("sorry its still a week day");
        }

    }
}
