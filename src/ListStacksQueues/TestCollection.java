package ListStacksQueues;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by SurfacePro on 11.03.2015.
 */
public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1 : ");
        System.out.println(collection1);

        System.out.println("\n is Dallas in collection ?" + collection1.contains("Dallas"));

        System.out.println(collection1.size() + "cities in collection");

        collection1.remove("Dallas");

        System.out.println("\n" + collection1.size() + "cities are in collection1 now");

        Collection<String> collection2 = new ArrayList<>();

        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\n list of cities in collection 2: ");
        System.out.println(collection2+ "\n");

        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        System.out.println("c1 = " + c1);
        c1.addAll(collection2);
        System.out.println("Cities in Collection 1 and Collection  2 " + c1);

        c1 = (ArrayList<String >) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\n Cities in collection1 and collection2");
        System.out.println(c1);


        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\n Cities in collection 1 but not in 2 ");
        System.out.println(c1);














    }
}
