import java.util.*;

class sln {

    private static void mrgsrt(String[] arr, int low, int mid, int high) {
            ArrayList<String> temp = new ArrayList<>();
            int left = low;
            int right = mid + 1;
    
           
    
            while (left <= mid && right <= high) {
            if (arr[left].compareTo(arr[right]) <= 0) {
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

    public static void m_s(String[] arr, int low, int high) {
            if (low >= high) {
                return;
            }
            int mid = (low + high) / 2;
    
            m_s(arr, low, mid);
            m_s(arr, mid + 1, high);
            mrgsrt(arr, low, mid, high);

    }
}
/* 
public class mergeSortString {

    public static void main(String[] args) {
        // int[] arr = { 3, 1, 4, 8, 5, 2, 9, 7, 6, 3, 1, 4, 8, 5, 2, 9, 7, 6 };
        
        String[] arr = {"Nofal", "Mohsin", "Arman", "Sajjad", "Faizal", "Abrar", "Shiraj", "Hassan", "Niraj", "Kaushik"};
        int n = arr.length;

        System.out.println("The og array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + (i+1) + " = [ " + arr[i] + " ] ");
        }
        System.out.println("");
        sln.m_s(arr, 0, n - 1);
        System.out.println("The og array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + (i+1) + " = [ " + arr[i] + " ] ");
        }
    }

}
*/

public class mergeSortString {

    public static void main(String[] args) {
        // int[] arr = { 3, 1, 4, 8, 5, 2, 9, 7, 6, 3, 1, 4, 8, 5, 2, 9, 7, 6 };
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("The og array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + (i+1) + " = [ " + arr[i] + " ] ");
        }
        System.out.println(" ");
        sln.m_s(arr, 0, n - 1);
        System.out.println("The og array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + (i+1) + " = [ " + arr[i] + " ] ");
        }
    }
}