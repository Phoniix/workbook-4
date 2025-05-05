package com.pluralsight;

import com.pluralsight.objects.Reservation;
import com.pluralsight.ui.LogInScreen;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private LocalDate startDate = null;
    private LocalDate endDate = null;

    public static void main(String[] args) {
        Reservation newStay = new Reservation("king", 3, false);
        System.out.println(newStay.getPrice() + " " + newStay.getReservationTotal());
    }

    public static void getDates () {

    }
    public LocalDate setStartDate (LocalDate startDate) {

        return this.startDate = startDate;
    }

}
