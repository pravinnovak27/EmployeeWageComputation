package com.bridgelabz;

public class ComputeWage {
    
    public static void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        // constant
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        int totalWage = 0;
        int workingHrs = 0;

        System.out.println("Details of " + companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHrs);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
                && totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs) {

            int empType = (int) (Math.random() * 100) % 3;

            /*
            using switch case
             */
            switch (empType) {
                case FULL_TIME:
                    workingHrs = 8;
                    break;
                case PART_TIME:
                    workingHrs = 8;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }

            int wage = workingHrs * wagePerHr;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
    }

    public static void main(String args[]) {
        calculateTotalWage("Amazon", 70, 20, 200);
        calculateTotalWage("BigBazar", 40, 20, 180);
    }
}
