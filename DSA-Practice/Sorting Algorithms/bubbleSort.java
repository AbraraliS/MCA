public class bubbleSort {
    

    static void bubble_sort(int[] arr, int n){
        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.print("Print Bubble sort : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }


        // for(int i=0; i < n-1; i++){
        //     int min = i;
        //     for(int j = i + 1; j < n; j++){
        //         if (arr[j] < arr[min]) {
        //             min = j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min] = arr[i];
        //     arr[i] =temp;
        // }
        // System.out.println("");
        // System.out.print("Print Selection Sort : ");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }



    public static void main(String[] args) {
         int[] arr = {4,3,2,5,1};
         int n = arr.length;

         System.out.print("Og Array : ");
         for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println("");
         bubble_sort(arr, n);
    }
}
