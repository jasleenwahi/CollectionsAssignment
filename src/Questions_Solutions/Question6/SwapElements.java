package Questions_Solutions.Question6;

import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println("Before swapping : \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        // Swap the second and fourth number in the list
        int numberatSecondPosition = numbers.get(1);
        int numberatfourthPositon = numbers.get(3);
        numbers.set(1, numberatfourthPositon);
        numbers.set(3, numberatSecondPosition);

        System.out.println("\nAfter swapping : \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}