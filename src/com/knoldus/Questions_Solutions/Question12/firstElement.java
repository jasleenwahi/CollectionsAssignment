package com.knoldus.Questions_Solutions.Question12;

import java.util.LinkedList;

public class firstElement
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("The given list is: \n");
        for(Integer index: numbers)
        {
            System.out.print(index);
        }

        System.out.println("\nPrinting first element by way one: "+numbers.peek());
        System.out.println("\nPrinting first element by way two: "+numbers.getFirst());
        System.out.println("\nPrinting first element by way three: "+numbers.peekFirst());
    }
}
