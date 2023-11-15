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
        /*Assume that the while statement loops L times.
        If target is at the start of the array, the if-else statement executes L times.
        If target is at the end of the array, the if-else statement executes 2 * L times.
        This leads to unbalance.
         */
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

    /*
    This is a balanced method to achieve binary search.
     */
    public static int binarySearchBalanced(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while (1 < j - i){
            int m = (i + j) >>> 1;
            if(target < arr[m]){
                j = m;
            }else{
                i = m;
            }
        }
        if(arr[i] == target){
            return i;
        }else{
            return -1;
        }
    }

    /**
     * There is a possible case that two or more elements whose value equals to target in the array.
     * @param arr a sorted array
     * @param target value to be checked
     * @return the index of the leftmost target
     */
    public static int binarySearchLeftmost(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        int candidate = -1;
        while (i <= j){
            int m = (i + j) >>> 1;
            if(target < arr[m]){
                j = m - 1;
            } else if (arr[m] < target) {
                i = m + 1;
            }else {
                candidate = m; //save the candidate index
                j = m - 1;
            }
        }
        return candidate;
    }

    public static int binarySearchRightmost(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        int candidate = -1;
        while (i <= j){
            int m = (i + j) >>> 1;
            if(target < arr[m]){
                j = m - 1;
            } else if (arr[m] < target) {
                i = m + 1;
            }else {
                candidate = m; //save the candidate index
                i = m + 1;
            }
        }
        return candidate;
    }

    /**
     * This is a modified binary search leftmost method.
     * @param arr a sorted array
     * @param target value to be checked
     * @return the leftmost index of the element which is greater than or equals to the target
     */
    public static int binarySearchLeftmostModified(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int m = (i + j) >>> 1;
            if(target <= arr[m]){
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

}
