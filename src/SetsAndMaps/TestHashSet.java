package SetsAndMaps;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Gurkan on 12.03.2015.
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");  //// Set does not effect duplicates!

        System.out.println(set);

        for (String s : set){
            System.out.println(s.toUpperCase());
        }

    }
}
