package ThirdWeek.FindPowerOfNumWithRecurs;

import java.util.Scanner;

public class FindPowerOfNumWithRecurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        int base = scanner.nextInt();
        System.out.print("Enter Power Number : ");
        int power = scanner.nextInt();

        System.out.print("Result : "+findPowerOfNumWithRecurs(power,base));

    }

    static int findPowerOfNumWithRecurs(int power,int base){
        if (power == 1){
            return base;
        }
        else
            return base*findPowerOfNumWithRecurs(power-1,base);
    }
}
