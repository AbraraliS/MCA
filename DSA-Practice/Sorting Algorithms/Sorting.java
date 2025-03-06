public class Sorting {

    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
  
        System.out.print("Print Selection Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }





        System.out.print("Print Insertion Sort : ");
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
        bubble_sort(arr, n);
        System.out.println("");
        selection_sort(arr, n);
        System.out.println("");
        insertion_sort(arr, n);
    }
}
