package SecondWeek.LeapYear;

import java.util.Scanner;

public class LeapYearCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking the year from user
        System.out.print("Enter a Year : ");
        int year = scanner.nextInt();


        if (isLeapYear(year))
            System.out.println(year+" is a leap year!"); // Printing the result
        else
            System.out.println(year+" is not a leap year!");  // Printing the result
    }


    // Calculating if the year is leap or not
    public static boolean isLeapYear(double year){
        if (year %4 == 0){
            return year % 400 == 0;
        }
        return false;
    }
}
