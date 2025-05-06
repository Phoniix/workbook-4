package com.pluralsight.objects;

public class Hotel {
    private String name = "";
    private int numberOfSuites = 0;
    private int numberOfRooms = 0;
    private int bookedSuites = 0;
    private int bookedBasicRooms = 0;

    public Hotel(int bookedSuites, int bookedBasicRooms) {
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel () {
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }


}
