package com.pluralsight.objects;

public class Room {
    private int numberOfBeds = 0;
    private double price = 0;
    private boolean isOccupied = false;
    private boolean isDirty = false;
    private boolean isAvailable =  false;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //Methods
    public void checkIn (Boolean isOccupied, Boolean isAvailable, Boolean isDirty) {


    }

    //ToString
    @Override
    public String toString() {
        return "Number of beds: " + numberOfBeds + "\n" +
                "Price of room: $" + price + "\n" +
                "Occupied: " + (isOccupied ? "Yes" : "No") + "\n" +
                "Dirty: " + (isDirty ? "Yes" : "No") + "\n" +
                "Available: " + (isAvailable ? "Yes" : "No");
    }
}
