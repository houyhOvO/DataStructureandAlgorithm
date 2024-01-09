package Recursion;


public class BubbleSort {

    public static void sort(int[] a){
        bubble(a, a.length - 1);
    }

    /**
     *
     * @param a the array to be sorted
     * @param j right border of unsorted part
     */
    private static void bubble(int[] a, int j){
        if(j == 0){
            return;
        }
        int x = 0;
        for(int i = 0; i < j; i++){
            if(a[i] > a[i + 1]){
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
                x = i;
            }
        }
        bubble(a, x);
    }

}
