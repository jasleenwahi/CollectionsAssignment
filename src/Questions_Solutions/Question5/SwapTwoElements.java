package Questions_Solutions.Question5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Before swapping elements: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        // Swap elements at index 2 and index 3
        Collections.swap(numbers, 2, 3);

        System.out.println("\nAfter swapping elements: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
