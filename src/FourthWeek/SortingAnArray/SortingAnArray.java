package FourthWeek.SortingAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAnArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       printTheSortedArray(fillingTheArray());

    }

    public static void printTheSortedArray(int[] array){
        System.out.print("Sorting : ");
        for (int j : array) {
            System.out.print(j + "    ");
        }
    }
    public static int[] fillingTheArray(){
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arrayNotSorted = new int[size];
        System.out.println("Please enter the number of array : ");
        for (int i = 0; i < arrayNotSorted.length; i++) {
            System.out.print((i+1)+". element : ");
            arrayNotSorted[i] = scanner.nextInt();
        }
        Arrays.sort(arrayNotSorted);
        return  arrayNotSorted;
    }

}
