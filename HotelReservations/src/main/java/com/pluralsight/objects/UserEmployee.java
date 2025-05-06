package com.pluralsight.objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserEmployee {
    private String profileName = "";
    private String userName = "";
    private String password = "";

    public UserEmployee(String profileName, String userName, String password) {
        this.profileName = profileName;
        this.userName = userName;
        this.password = password;
    }

    public static ArrayList<UserEmployee> allEmpSignOn() throws IOException {
        ArrayList<UserEmployee> allEmployees = new ArrayList<>();
        BufferedReader lilTim = new BufferedReader(new FileReader("userinfo.txt"));
        lilTim.readLine(); // Skips Header

        do {
            String [] parts = lilTim.readLine().split("\\|");
            if (parts.length > 3) {
                String profileName = parts[1];
                String userName = parts[2];
                String password = parts[3];
                UserEmployee tempEmployee = new UserEmployee (profileName, userName, password);
                allEmployees.add(tempEmployee);
            }
        } while (lilTim.readLine() != null);
        return allEmployees;
    }



}
