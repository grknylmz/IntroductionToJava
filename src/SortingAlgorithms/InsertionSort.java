
package SortingAlgorithms;

/**
 * Created by Gurkan on 12.03.2015.
 */

/////Insertion Sort Complexity is O(n2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] mixedList = {6,67,46,43,14,683,6486,1385,315654,1313,146,1613,16,1364,589};
        insertionSort(mixedList);
        for (int i = 0; i < mixedList.length; i++) {
            System.out.println(mixedList[i]);
        }
    }
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k ;
            for (k = i-1 ; k >= 0 && list[k] >currentElement ; k--) {
                list[k+1] = list[k];
            }
            list[k+1]=currentElement;

        }
    }
}

