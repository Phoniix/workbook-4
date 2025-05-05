package com.pluralsight.objects;

public enum DayOfWeek {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private final int DAY_NUMBER;

    // Constructor
    DayOfWeek (int dayNumber) {
        this.DAY_NUMBER = dayNumber;
    }

    //Getter
    public int getDAY_NUMBER() {
        return DAY_NUMBER;
    }

    public static DayOfWeek fromJavaDay (java.time.DayOfWeek javaDay) {
        return DayOfWeek.values()[javaDay.getValue() -1];
    }
}
