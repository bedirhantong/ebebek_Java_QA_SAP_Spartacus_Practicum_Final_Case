package ThirdWeek.FindingPerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking Input From User
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        // Looking for is it a Perfect Number or Not
        if (isPerfectNumber(number)){
            System.out.println(number+" is a Perfect Number!");
        }else {
            System.out.println(number+" is not a Perfect Number!");
        }
    }
    static boolean isPerfectNumber(int number){
        int totalDivider = 1;
        for (int i = 2; i < number; i++) {
            if (number %i == 0){
                totalDivider+=i;
            }
        }
        return totalDivider==number;
    }
}
