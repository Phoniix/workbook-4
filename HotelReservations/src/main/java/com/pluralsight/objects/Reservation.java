package com.pluralsight.objects;

public class Reservation {
    private String customerName = "";
    private static double price = 124.00;
    private int numberOfNights = 0;
    private boolean weekend = false;
    private static double reservationTotal = 0;

    // Constructor
    public Reservation(String customerName, int numberOfNights, boolean isWeekend, Room room) {
        this.customerName = customerName;
        this.price = setPrice(room, this.weekend);
        this.numberOfNights = numberOfNights;
        this.weekend = isWeekend;
        this.reservationTotal = setReservationTotal(this.price, this.numberOfNights);
    }

    //Getters
    public double getPrice() {
        return this.price;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public boolean isWeekend() {
        return weekend;
    }
    public double getReservationTotal() {
        return this.setReservationTotal(this.price, this.numberOfNights);
    }

    //Setters
    private double setPrice(Room room, boolean isWeekend) {
        if (this.weekend) {
            if (room.getRoomType().equals("king")) {this.price = 152.90;}
            if (room.getRoomType().equals("double")) {this.price = 136.40;}
        } else {
            if (room.getRoomType().equals("king")) {this.price = 139.00;}
            if (room.getRoomType().equals("double")) {this.price = 124.00;}
        }
        return this.price;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public void setWeekend(boolean weekend, DayOfWeek days) {

        this.weekend = weekend;
    }
    private double setReservationTotal(double price, int numberOfNights) {
        return this.reservationTotal = this.price * this.numberOfNights;
    }
    public void setCustomerName (String name) {
        this.customerName = customerName;
    }

    //ToString


    public String toString(Room room) {
        return "Customer Name: " + customerName.substring(0 ,1).toUpperCase() + customerName.substring(1).replaceAll("^[A-Za-z\\p{P}\\p{S}\\s]+$", "*") + "\n" +
                "Room Type: "  + room.getRoomType().substring(0,1).toUpperCase() + room.getRoomType().substring(1) + "\n" +
                "Price: $" + price + "\n" +
                "Number of Nights: " + numberOfNights + "\n" +
                "Weekend Stay?: " + (weekend ? "Yes" : "No") + "\n" +
                "Total Cost of Reservation: $" + reservationTotal;
    }
}
