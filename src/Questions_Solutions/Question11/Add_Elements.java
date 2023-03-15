package Questions_Solutions.Question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Elements
{
    public static void main(String a[])
    {

        List<String> names = new ArrayList<String>();
        names.add("Jasleen");
        names.add("Riya");
        names.add("Sahil");
        System.out.println("List before adding all:");
        for (String index: names)
        {
            System.out.print(index+" ");
        }
        Collections.addAll(names, "Pradyuman","Ayush");
        System.out.println("\nAfter adding elements:");
        for (String index: names)
        {
            System.out.print(index+" ");
        }

    }
}
