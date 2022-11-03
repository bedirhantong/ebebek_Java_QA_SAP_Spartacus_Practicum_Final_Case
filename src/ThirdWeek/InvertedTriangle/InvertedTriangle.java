package ThirdWeek.InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int numberOfDigit = inp.nextInt();
        drawInvertedTriangle(numberOfDigit);
    }
    static void drawInvertedTriangle(int numberOfDigit){
        int row = numberOfDigit;
        numberOfDigit = (numberOfDigit*2)-1;
        while (row > 0){
            for (int i = 10; i > row; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < numberOfDigit; i++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfDigit-=2;
            row--;
        }
    }
}
