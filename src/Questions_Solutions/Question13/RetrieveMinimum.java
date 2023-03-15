package Questions_Solutions.Question13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RetrieveMinimum
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(3);
        numbers.add(15);

        System.out.println("The list is : \n");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        //Collections.min() returns the minimum element
        Integer minimum = Collections.min(numbers);
        System.out.println("\nMinimum element in the list is: " + minimum);
    }
}
