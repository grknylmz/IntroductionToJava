package SetsAndMaps;

/**
 * Created by Gurkan on 12.03.2015.
 */
public class TestMethodsInCollection {
    public static void main(String[] args) {

        java.util.Set<String> set1 = new java.util.HashSet<>();

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is" + set1);
        System.out.println(set1.size() + "elements in set1");

        set1.remove("London");
        System.out.println("\n set 1 is "  + set1);
        System.out.println(set1.size() + "elements in set1");


        java.util.Set<String> set2 = new java.util.HashSet<>();
        set2.add("London");
        set2.add("Paris");
        set2.add("Shanghai");

        System.out.println("\n Taipei in set2 ? " + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("\n After adding set 2 to set1 , set 1 is : " + set1);

        set1.remove(set2);
        System.out.println("\n after removing set2 from set1  , set1 is " + set1);


        set1.retainAll(set2);
        System.out.println("After removing common elents in set 2 from set 1 , set1 is" + set1);




    }
}
