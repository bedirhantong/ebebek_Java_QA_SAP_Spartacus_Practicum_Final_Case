package SecondWeek.FlightTicketPrice;

import java.util.Scanner;

public class FlightTicketPrice {

    public static void main(String[] args) {
        ticketPriceInput();
    }

    public static void ticketPriceInput(){
        Scanner scanner = new Scanner(System.in);
        // Initializing variables needed
        int distance;
        int age;
        int tripType;


        // Taking Input till the variable are appropriate
        while (true){
            System.out.print("Enter the distance : ");
            distance =  scanner.nextInt();

            System.out.print("How old are you : ");
            age = scanner.nextInt();

            System.out.print("Trip Type : 1 for one way, 2 for round trip : ");
            tripType = scanner.nextInt();

            if (distance > 0 && age>0 && (tripType ==1 || tripType==2)){
                break;
            }else {
                System.out.println("""
                        Input is not appropriate for the conditions
                        Your age and distance must be positive
                        Also Trip type can be 1 or 2""");
            }
        }
        // Calculating and printing the total price
        System.out.println("Total Price : "+ticketPriceCalculator(distance,age,tripType));
    }
    private static double ticketPriceCalculator(int distance, int age, int tripType){
        // Calculating price according to conditions given
        double price = distance*(0.1);
        if (age < 12){
            price/=2;
        } else if (age < 24) {
            price-= price*(0.1);
        } else if (age>65) {
            price-= (price*3)/10;
        }

        if (tripType == 2){
            price-=(price/5);
            return price*2;
        }
        return price;
    }




}
