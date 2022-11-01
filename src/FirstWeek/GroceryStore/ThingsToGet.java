package FirstWeek.GroceryStore;

import java.util.Scanner;

public class ThingsToGet {
    public static void main(String[] args) {
        // I implement Scanner class to get input from user
        Scanner inp= new Scanner(System.in);

        // I give instructions to the user about price of each product
        System.out.println("*************PRODUCTS KG PRİCES**************");
        System.out.println("Pear:2,14 \nApple: 3,67\nTomato: 1,11\nBanana: 0,95");


        /*
            Getting input of each amount of food so that we can calculate
            how much it cost
        */

        System.out.print("How much kg Pear do you wanna get? ");
        float totalPear = (float)((inp.nextFloat())*2.14);

        System.out.print("How much kg Apple do you wanna get? ");
        float totalApple = (float)((inp.nextFloat())*3.67);

        System.out.print("How much kg Tomato do you wanna get? ");
        float totalTomato = (float)((inp.nextFloat())*1.11);

        System.out.print("How much kg Banana do you wanna get? ");
        float totalBanana = (float)((inp.nextFloat())*0.95);


        /*
            I calculate the total price
        */

        float totalPrice= (totalPear + totalBanana +totalApple+ totalTomato);
        System.out.println(totalPrice);

    }
}
