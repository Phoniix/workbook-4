package com.pluralsight.ui;

import com.pluralsight.designElements.Design;
import com.pluralsight.objects.MenuOptions;
import com.pluralsight.objects.UserEmployee;

import java.io.IOException;
import java.util.Scanner;

public class LogInScreen {

    public static void logIn (Scanner scanner) throws IOException {
        boolean keepGoing = true;
        while (keepGoing) {
            scanner = new Scanner(System.in);
            Design.titleNewLineTop();
            System.out.println("Please select an option\n" +
                    "(I) RETURNING EMPLOYEE SIGN ON\n" +
                    "(S) NEW EMPLOYEE SIGN UP");
            Design.titleLineBottom();
            String userInput = scanner.nextLine().trim().replaceAll("\\s+", "");
            if (Design.isEmpty(userInput)) {Design.thisFieldCantBeEmpty();continue;}
            if (userInput.length() > 1) {System.out.println("Please only choose 1 option!"); continue;}
            char userChoice = userInput.toUpperCase().charAt(0);


            if (userChoice == MenuOptions.RETURNING_EMPLOYEE_SIGN_IN.getMENU_CODE()) {
                String userName = Design.getGeneralString(scanner, "Enter Employee User Name.");
                String password = Design.enterPassword(scanner);
                for (UserEmployee employee : UserEmployee.allEmpSignOn()) {
                    String [] parts = employee.
                }
            } else if (userChoice == MenuOptions.NEW_EMPLOYEE_SIGN_UP.getMENU_CODE()) {

            } else {
                System.out.println("Invalid Input. Please choose from listed options.");
            }


            Design.getNounPrompt(scanner, "Enter Profile Name (EMPLOYEE NAME).");
            Design.getGeneralString(scanner, "Enter New Employee User Name.");
            Design.getPasswordString(scanner);
        }
    }
}
