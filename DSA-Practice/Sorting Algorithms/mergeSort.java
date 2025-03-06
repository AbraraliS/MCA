import java.util.*;

class Solution {

    private static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void merge_Sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        merge_Sort(arr, low, mid);
        merge_Sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = { 444, 333, 777, 111, 444, 888, 999, 111 };
        // int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        int n = arr.length;
        // int n = 7;

        System.out.println("The og array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " = [ " + arr[i] + " ] ");
        }
        System.out.println(" ");
        Solution.merge_Sort(arr, 0, n - 1);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " = [ " + arr[i] + " ] ");
        }

    }
}
