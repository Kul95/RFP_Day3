package com.Practice.EmployeeWage;

public class UC5 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
        int empHours = 0, empWage = 0, totalEmpWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage: " + empWage);
        }
        System.out.println("Total Employee Wage  :" + totalEmpWage);
    }
}