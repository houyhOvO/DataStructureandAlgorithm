package Recursion;

public class BinarySearch {

    public static int search(int[] a, int target){
        return f(a, target, 0, a.length - 1);
    }

    /**
     * find the index of a value
     * @param a a number array
     * @param target the value to be searched
     * @param i the start index
     * @param j the end index
     * @return the index of the target, otherwise, return -1
     */
    private static int f(int[] a, int target, int i, int j){
        if(i > j){
            return -1;
        }
        int m = (i + j) >>> 1;
        if(target < a[m]){
            return f(a, target, i, m - 1);
        } else if (a[m] < target) {
            return f(a, target, m + 1, j);
        }else {
            return m;
        }
    }
}
