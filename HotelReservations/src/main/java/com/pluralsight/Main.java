package com.pluralsight;

import com.pluralsight.ui.LogInScreen;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private LocalDate startDate = null;
    private LocalDate endDate = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            LogInScreen.LogIn(scanner);
        }
    }

    public static void getDates () {

    }
    public LocalDate setStartDate (LocalDate startDate) {

        return this.startDate = startDate;
    }

}
