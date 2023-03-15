package Questions_Solutions.Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceElements
{
    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Jaguar");
        animals.add("Rhinoceros");
        animals.add("White Tiger");
        animals.add("Lion");


        // Replace all elements with one new object

        Scanner input = new Scanner(System.in);
        for (Integer index = 0; index < animals.size(); index++) {
            System.out.println("Enter an object you want to replace existing with: ");
            String newAnimal=input.next();
            animals.set(index, newAnimal);
        }

        for (String animal : animals) {
            System.out.print(animal+" ");
        }

    }
}
