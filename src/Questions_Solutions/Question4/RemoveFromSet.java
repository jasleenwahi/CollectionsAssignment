package Questions_Solutions.Question4;

import java.util.LinkedHashSet;

public class RemoveFromSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(20);
        numbers.add(10);
        numbers.add(5);

        System.out.println("Numbers set before removing an element: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        // Remove an element from the set
        numbers.remove(20);
        System.out.println("\nNumbers set after removing an element: \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
