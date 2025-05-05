package com.pluralsight.ui;

import com.pluralsight.designElements.Design;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LogInScreen {

    public static void LogIn (Scanner scanner) throws IOException {
        userInfo();
        Design.titleNewLineTop();
        System.out.println("Hello! Please Sign In or Create User Profile.");
        Design.titleLineBottom();
        System.out.println("\n\n");


    }

    private static ArrayList<String> userInfo () throws IOException {
        ArrayList<String> userInfo = new ArrayList<>();
        BufferedReader lilTim = new BufferedReader(new FileReader("userinfo.txt"));
        lilTim.readLine();

        while (lilTim.readLine() != null) {
            userInfo.add(lilTim.readLine());
        }
        return userInfo;
    }
    private static void createEmployeeProfile (Scanner scanner) throws IOException {
        boolean keepGoing = true;
        while (keepGoing) {
            String profileName = Design.getNounPrompt(scanner, "Please Enter Profile Name (EMPLOYEE NAME).");
            String userName = Design.getGeneralString(scanner, "Enter Username.");
            String password = Design.getPasswordString(scanner);
            BufferedWriter lilJon = new BufferedWriter(new FileWriter("userinfo.txt", true));
            lilJon.write(profileName + "|" + userName +"|" + password);
        }
    }
}
