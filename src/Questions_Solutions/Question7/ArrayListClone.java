package Questions_Solutions.Question7;

import java.util.ArrayList;

public class ArrayListClone
{
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(10);
        original.add(20);
        original.add(40);
        original.add(60);

        System.out.println("Original array elements are : \n");
        for (Integer index: original) {
            System.out.print(index+" ");
        }

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        System.out.println("\nCloned array elements are : \n");
        for (Integer index: cloned) {
            System.out.print(index+" ");
        }
    }
}
