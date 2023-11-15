package BinarySearch;

public class BinarySearch {
    /**
     * finds the position of a target value within a sorted array
     * @param arr a sorted array
     * @param target value to be checked
     * @return the index of the target if found, otherwise, return -1
     */
    public static int binarySearchBasic(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){ //there are still numbers in arr[i, j]
            int m = (i + j) >>> 1; // prevent overflow
            if(target < arr[m]){
                j = m - 1;
            } else if (arr[m] < target) {
                i = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }

    /*
    Another method to achieve binary search
     */
    public static int binarySearchAlternative(int[] arr, int target){
        int i = 0;
        int j = arr.length;
        while (i < j){ //Avoid falling into an infinite loop when the target is not in the array
            int m = (i + j) >>> 1;
            if(target < arr[m]){
                j = m;
            } else if (arr[m] < target) {
                i = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }

}
