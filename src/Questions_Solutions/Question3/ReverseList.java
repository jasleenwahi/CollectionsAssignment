package Questions_Solutions.Question3;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {

        // Create an ArrayList with 5 objects
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("List without reversing: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        // Reverse the numbers list
        Collections.reverse(numbers);

        System.out.println("\nReversed List: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}