package Questions_Solutions.Question9;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle_Elements
{
    public static void main(String[] args)
    {
        LinkedList<Integer> shuffledElements = new LinkedList<>();
        shuffledElements.add(10);
        shuffledElements.add(9);
        shuffledElements.add(3);
        shuffledElements.add(8);
        shuffledElements.add(6);
        shuffledElements.add(1);

        System.out.println("The list before shuffling elements: ");
        for(Integer element: shuffledElements)
        {
            System.out.print(element+" ");
        }
        Collections.shuffle(shuffledElements);
        System.out.println("\nThe list after shuffling elements: ");
        for(Integer element: shuffledElements)
        {
            System.out.print(element+" ");
        }
    }
}
