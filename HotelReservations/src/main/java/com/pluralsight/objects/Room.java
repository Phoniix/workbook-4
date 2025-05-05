package com.pluralsight.objects;

public class Room {
    private String roomType = "";
    private int numberOfBeds = 0;
    private boolean occupied = false;
    private boolean dirty = false;
    private boolean available =  false;

    public Room(String roomType, int numberOfBeds, boolean occupied, boolean dirty, boolean available) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public String getRoomType() {
        return roomType;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }

    public void setRoomType(String roomType) {
        if (!roomType.equals("double") || !roomType.equals("king")) {
            throw new RuntimeException("Invalid room type");
        }
        this.roomType = roomType;
    }
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void checkIn () {
        this.setOccupied(true);
        this.setDirty(true);
        this.setAvailable(false);
    }
    public void checkOut () {
        this.setOccupied(false);
        this.setDirty(true);
         this.setAvailable(false);
    }
    public void cleanRoom () {
        if (this.occupied) {
            this.setDirty(false);
        } else {
            this.setDirty(false);
            this.setAvailable(true);
        }
        this.setDirty(false);
    }

    //ToString
    @Override
    public String toString() {
        return "Room type: " + roomType + "\n" +
                "Number of beds: " + numberOfBeds + "\n" +
                "Occupied: " + (occupied ? "Yes" : "No") + "\n" +
                "Dirty: " + (dirty ? "Yes" : "No") + "\n" +
                "Available: " + (available ? "Yes" : "No");
    }
}
