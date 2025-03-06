public class bubbleSortRTC {

    static void bubble_sortRTC(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }

            }
            if (didSwap == 0) {
                break;
            }

        }
        System.out.print("Print Bubble sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 1 };
        int n = arr.length;

        System.out.print("Og Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        bubble_sortRTC(arr, n);
    }
}
