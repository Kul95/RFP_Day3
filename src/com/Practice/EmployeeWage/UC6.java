package com.Practice.EmployeeWage;

public class UC6 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static final int MAX_HRS_IN_MONTH=10;

    public static void main(String[] args) {
        int empHours=0,empWage=0,totalEmpWage=0,totalWorkingDays=0,totalEmployeeHrs=0;
       while(totalEmployeeHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS){
           totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random() * 10) % 3;
            switch(empCheck){
                case IS_PART_TIME:empHours=4;break;
                case IS_FULL_TIME:empHours=8;break;
                default:empHours=0;
            }
          totalEmployeeHrs+=empHours;
           System.out.println("Days:"+totalWorkingDays+" Emp hrs:"+empHours);
        }
         totalEmpWage=totalEmployeeHrs*EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage: "+totalEmpWage);
    }
}
