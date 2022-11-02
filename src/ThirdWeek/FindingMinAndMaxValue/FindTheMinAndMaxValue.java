package ThirdWeek.FindingMinAndMaxValue;

import java.util.Scanner;

public class FindTheMinAndMaxValue {
    public static void main(String[] args) {
        int minValue = 0;
        int maxValue = 0;
        Scanner scanner = new Scanner(System.in);

        // Taking number of total Input from User that countered
        System.out.print("How many numbers will you be entering? ");
        int numOfInput = scanner.nextInt();


        // Taking the numbers that could calculate as max or min number
        int[] enteredNumbers = new int[numOfInput];
        for (int i = 0; i < numOfInput; i++) {
            System.out.print("Enter the "+(i+1)+". number : ");
            enteredNumbers[i] = scanner.nextInt();
        }


        //Printing the max and min value
        System.out.println("The Max Value is : "+ findMaxValue(enteredNumbers));
        System.out.println("The Min Value is : "+ findMinValue(enteredNumbers));
    }


    // Finding the max value
    static int findMaxValue(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result){
                result = arr[i];
            }
        }
        return result;
    }

    // Finding the min value
    static int findMinValue(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result){
                result = arr[i];
            }
        }
        return result;
    }
}
