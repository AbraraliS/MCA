public class binarySearchRecus {
    public static int binary_search(int[] arr, int low, int high, int target){
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        else if (target > arr[mid]) {
            return binary_search(arr, mid + 1, high, target);
        }
        return binary_search(arr, low, mid - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8};
        int n = arr.length;
        int target = 6;

        System.out.print("Element Indexes are : ");
        for(int i = 0; i < n; i++){
           System.out.print(i + " = [ " +arr[i] + " ]  ");
        }
        System.out.println("");
       int ans = binary_search(arr, 0, n - 1, target);

       if (ans == -1) {
            System.out.println("No Element Found...");
       }else{
        System.out.println("Element index is : " + ans);
       }
   }
}
