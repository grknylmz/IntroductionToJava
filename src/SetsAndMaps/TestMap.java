package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Gurkan on 12.03.2015.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in the map");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println("Display entries in ascendin order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.putAll(hashMap);
        System.out.println("\n The age for Lewis is" + linkedHashMap.get("Lewis"));

        System.out.println("\n Display entries in LinkedHashMap " + linkedHashMap);




    }
}
