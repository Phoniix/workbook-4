package com.pluralsight.objects;

import java.time.LocalDate;

public class Reservation {

    private String roomType = "double";
    private double price = 124.00;
    private int numberOfNights = 0;
    private boolean isWeekend = false;
    private double reservationTotal = 0;

    // Constructor
    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    //Getters
    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    //Setters
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend, DayOfWeek days) {

        isWeekend = weekend;
    }

    public void setReservationTotal(double reservationTotal) {
        if (this.isWeekend) {
            if (this.roomType.equals("king")) {this.price = 152.90;}
            if (this.roomType.equals("double")) {this.price = 136.40;}
        } else {
            if (this.roomType.equals("king")) {this.price = 139.00;}
            if (this.roomType.equals("double")) {this.price = 124.00;}
        }
        this.reservationTotal = this.price * this.numberOfNights;
    }

    //ToString

    @Override
    public String toString() {
        return "Room Type: " + roomType.toLowerCase().substring(0,1).toUpperCase() + roomType.substring(1) + "\n" +
                "Price: $" + price + "\n" +
                "Number of Nights: " + numberOfNights + "\n" +
                "Weekend Stay?: " + (isWeekend ? "Yes" : "No") + "\n" +
                "Total Cost of Reservation: $" + reservationTotal;
    }
}
