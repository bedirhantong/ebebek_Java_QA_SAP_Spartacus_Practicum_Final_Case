package FourthWeek.FrequencyOfANum;


import java.util.LinkedList;
import java.util.Objects;

public class FrequencyOfNumbers {
    public static void main(String[] args) {

        // Initializing an array so that we can test frequency of its each element
        int[] arr = {1,2,3,4};
        printFrequencyOfNumbers(arr);

    }

    static void printFrequencyOfNumbers(int[] array){
        // Initializing a list so that access and modify much more efficiently
        LinkedList<Integer> list = new LinkedList<>();
        int frequency = 0;

        // Adding all element of array to the list initialized
        for (int k : array) {
            list.add(k);
        }

        //initialize another list so that we can avoid testing same number
        LinkedList<Integer> basket = new LinkedList<>();

        // going through the list and printing the frequency
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j  && !basket.contains(list.get(i))){
                    if (Objects.equals(list.get(i), list.get(j))){
                        frequency++;
                        basket.add(list.get(j));
                    }
                }
            }
            System.out.println("Number "+array[i]+" repeated "+frequency+" times.");
            frequency=0;
        }

    }
}
