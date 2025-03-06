public class binarySearch {
 
    static int binary_search(int[] arr, int n, int target){
        
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2; //int mid = low + (high - low) / 2; we can use this logic as well.
            if(arr[mid] == target) return mid;
            else if(target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
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
       int ans = binary_search(arr, n, target);

       if (ans == -1) {
            System.out.println("No Element Found...");
       }else{
        System.out.println("Element index is : " + ans);
       }
   }


}
