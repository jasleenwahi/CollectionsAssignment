package com.knoldus.Questions_Solutions.Question1;
import java.util.LinkedList;
public class LinkedListToArray
{
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Convert the LinkedList to an Array
        Integer[] number_array = numbers.toArray(new Integer[0]);
        for (Integer number : number_array)
        {
            System.out.print(number+" ");
        }
    }
}

