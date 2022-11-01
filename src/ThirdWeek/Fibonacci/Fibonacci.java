package ThirdWeek.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    static void fibonacciNotRecursive(int number){
        int a=1,b=1;
        System.out.println(a+"\n"+b);
        int c=0;
        number-=2;
        for ( ; number>=1 ; number--){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

    static int fibonacciRecursive(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else {
            return fibonacciRecursive(num-2)+fibonacciRecursive(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Please Enter A Number : ");
        int number = input.nextInt();
        fibonacciNotRecursive(number);
    }
}
