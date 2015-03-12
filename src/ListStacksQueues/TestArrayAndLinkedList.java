package ListStacksQueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by SurfacePro on 11.03.2015.
 */
public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(0,4);

        System.out.println("A list of integers in arraylist");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");
        System.out.println();


        System.out.println("Print the list backwards");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous() + " ");
        System.out.println();





    }
}
