package SortingAlgorithms;

/**
 * Created by Gurkan on 12.03.2015.
 */

///Bubble Sort O(n2) complexity!
public class BubbleSort {
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length & needNextPass ; k++) {
            needNextPass=false;
            for (int i = 0; i < list.length - k; i++) {
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1]= temp;
                    needNextPass= true;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2,3,3,2,5,4,1};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
