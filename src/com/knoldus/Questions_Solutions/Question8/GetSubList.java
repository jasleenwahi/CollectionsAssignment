package com.knoldus.Questions_Solutions.Question8;

import java.util.ArrayList;
import java.util.Collections;

public class GetSubList {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(200);
        originalList.add(30);
        originalList.add(94);
        originalList.add(56);
        originalList.add(16);
        originalList.add(27);
        originalList.add(81);

        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(56);
        subList.add(16);
        subList.add(27);

        Integer index = Collections.indexOfSubList(originalList, subList);
        System.out.println("The starting index of the first occurrence of sublist: "+index);

    }
}