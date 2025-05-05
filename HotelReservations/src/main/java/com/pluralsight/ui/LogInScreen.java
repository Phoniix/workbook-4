package com.pluralsight.ui;

import com.pluralsight.designElements.Design;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogInScreen {

    public static void LogIn (Scanner scanner) throws IOException {
        userInfo();
        Design.titleNewLineTop();
        System.out.println("Hello! Please Sign In or Create User Profile.");
        Design.titleLineBottom();


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
    private static void createEmployeeProfile (Scanner scanner) {
        boolean keepGoing = true;
        while (keepGoing) {
            Design.getNounPrompt(scanner, "Please Enter Profile Name (EMPLOYEE NAME).");

        }
    }
}
