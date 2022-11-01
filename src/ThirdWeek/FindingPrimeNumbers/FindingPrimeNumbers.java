package ThirdWeek.FindingPrimeNumbers;

public class FindingPrimeNumbers {
    public static void main(String[] args) {
        findPrimeNumbers(100);
    }

    public static void findPrimeNumbers(int num){
        for (int i = 2; i <= num; i++) {
            if(isPrime(i))
                System.out.println(i+" ");
        }
    }

    public static boolean isPrime(int number){
        int divider=0;
        if (number == 2 ){
            return true;
        }
        else {
            for (int i = 3; i < number; i++) {
                for (int j = 2; j <i ; j++) {
                    if(number%j == 0)
                        divider++;
                }
            }
        }

        return number >= 2 && divider ==0;
    }
}
