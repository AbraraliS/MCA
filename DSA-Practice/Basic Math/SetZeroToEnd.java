public class SetZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 0, 0, 1, 0 };
        int n = arr.length;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[j] = 0;
                j--;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
