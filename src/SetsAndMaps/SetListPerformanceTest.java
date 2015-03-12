package SetsAndMaps;

import java.util.*;

/**
 * Created by Gurkan on 12.03.2015.
 */
public class SetListPerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for hash set is  "+
                getTestTime(set1) + "milliseconds" );
        System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + "milliseconds");

        Collection<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("Member test time for linkedHash set is  "+
                getTestTime(set2) + "milliseconds" );
        System.out.println("Remove element time for linkedHash set is " + getRemoveTime(set2) + "milliseconds");

        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("Member test time for TreeSet set is  "+
                getTestTime(set3) + "milliseconds" );
        System.out.println("Remove element time for TreeSet set is " + getRemoveTime(set3) + "milliseconds");

        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("Member test time for arrayList set is  "+
                getTestTime(list1) + "milliseconds" );
        System.out.println("Remove element time for arrayList set is " + getRemoveTime(list1) + "milliseconds");

        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("Member test time for linkedList set is  "+
                getTestTime(list2) + "milliseconds" );
        System.out.println("Remove element time for linkedList set is " + getRemoveTime(list2) + "milliseconds");


    }






    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            c.contains((int) (Math.random() * 2 * N));
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;

    }




}

