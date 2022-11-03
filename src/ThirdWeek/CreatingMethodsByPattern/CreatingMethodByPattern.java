package ThirdWeek.CreatingMethodsByPattern;

import java.util.Scanner;

public class CreatingMethodByPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number from suer
        System.out.print("Enter the number N : ");
        int number = scanner.nextInt();

        // Printing the result
        System.out.println("Result : "+create(number,number,0,0));


    }

    static String create(int number,int firstVal,int counter,int returnTime){
        /*
        Counter and FirstValue are just for printing for the first time
        ReturnTime is for make a decision about is it ever be negative or equal zero
         */
        if (returnTime == 0 && counter == 0){
            counter += 1;
            return String.valueOf(number).concat(" ").concat(create(number-5,firstVal,counter,returnTime));
        }
        // Starting adding 5 to the number according the value of number
        else if ( (number <0 || number == 0)  &&  returnTime == 0 ) {
            returnTime+=1;
            return String.valueOf(number).concat(" ").concat(create(number+5,firstVal,counter,returnTime));
        }else if (number == firstVal){
            return String.valueOf(number);
        }
        // Keep adding 5 to the number according the value of number
        else if (returnTime == 1) {
            return String.valueOf(number).concat(" ").concat(create(number+5,firstVal,counter,returnTime));
        } else
            return String.valueOf(number).concat(" ").concat(create(number-5,firstVal,counter,returnTime));
    }

}
