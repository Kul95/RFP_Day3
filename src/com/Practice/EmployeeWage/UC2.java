package com.Practice.EmployeeWage;

public class UC2 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHour = 0;
        int empWage = 0;
        if (empCheck == IS_FULL_TIME) {
            empHour = 8;
            empWage=empHour*EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage: "+empWage);
        }else{
            empHour = 0;
        empWage=empHour*EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage: "+empWage);
    }}
}
