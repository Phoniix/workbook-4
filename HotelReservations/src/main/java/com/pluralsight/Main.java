package com.pluralsight;

import com.pluralsight.objects.Reservation;
import com.pluralsight.objects.Room;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private LocalDate startDate = null;
    private LocalDate endDate = null;

    public static void main(String[] args) {
        Room newRoom = new Room("king", 1, false, false, true);
        Reservation newStay = new Reservation("Sean",3, false, newRoom);
        newRoom.checkIn();
        newRoom.checkOut();
        newRoom.cleanRoom();
        System.out.println(newRoom.toString());
    }

    public static void getDates () {

    }
    public LocalDate setStartDate (LocalDate startDate) {

        return this.startDate = startDate;
    }

}
