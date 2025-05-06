package com.pluralsight.objects;

import java.time.LocalTime;

public class Employee {
    int employeeID = 0;
    String name = "";
    String department = "";
    double payRate = 0;
    double hoursWorked = 0;

    public Employee(int employeeID, String name, String department, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getTotalPay () {
        return getRegularHours() + getOTHours();
    }

    public double getRegularHours () {
        double regularHours = 0;
        if (this.hoursWorked <= 40) {
            regularHours = this.payRate * this.hoursWorked;
        } else {
            regularHours = this.payRate * 40;
        }
        return regularHours;
    }

    public  double getOTHours () {
        double oTime = 0;
        if (this.hoursWorked > 40) {
            oTime = (this.hoursWorked - 40) * (1.5 * this.payRate);
        } else {
            oTime = 0;
        }
        return oTime;
    }

    public double punchIn (double time) {
        return time;
    }
    public double punchIn () {
        LocalTime punchIn = LocalTime.now();
        double hours = punchIn.getHour();
        int minutesInput = punchIn.getMinute();
        double minutes = minutesInput / 60;
        return hours + minutes;
    }

    public double punchOut (double time) {
        return time;
    }
    public double punchOut () {
        LocalTime punchOut = LocalTime.now();
        double hours = punchOut.getHour();
        int minutesInput = punchOut.getMinute();
        double minutes = minutesInput / 60;
        return hours + minutes;
    }



}
