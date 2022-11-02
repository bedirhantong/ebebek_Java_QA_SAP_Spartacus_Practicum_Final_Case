package FourthWeek.Transpose;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Initializing the array via taking input from user
        System.out.print("Enter the number of rows : ");
        int row = inp.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = inp.nextInt();
        int[][] arr= new int[row][column];

        // Filling the array via taking input from user
        for (int i = 0; i< row; i++){
            for (int j = 0; j< column; j++){
                arr[i][j]=inp.nextInt();
            }
        }

        // Printing Matrix
        System.out.println("Matrix");
        for (int i = 0; i< row; i++){
            for (int j = 0; j< column; j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }


        // Taking Transpose of given array
        int m=0;
        int[][] transposeArr = new int[column][row];
        for (int i = 0; i< column; i++,m++)
        {
            transposeArr[i][m]= arr[m][i] ;
            for (int j = 0; j< row; j++){
                transposeArr[m][j] = arr[j][m];
            }
        }

        // Printing array that transposed
        System.out.println("Transpose");
        for (int i = 0; i< column; i++){
            for (int j = 0; j< row; j++){
                System.out.print(transposeArr[i][j]+"    ");
            }
            System.out.println();
        }

    }
}
