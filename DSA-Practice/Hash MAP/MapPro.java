import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // getting Array Values
        System.out.print("Enter N value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> mHashMap = new HashMap<>();
        System.out.println("Enter Array Values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mHashMap.put(arr[i], mHashMap.getOrDefault(arr[i], 0) + 1);
        }

        // Pre-compute HashMap
        // HashMap<Integer, Integer> mHashMap = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     // Increment count in HashMap
        //     mHashMap.put(arr[i], mHashMap.getOrDefault(arr[i], 0) + 1);
        // }

    //  for (Integer key : mHashMap.keySet()) {
    //      System.out.println("Key: " + key);
    //  }

    // for (Integer value : mHashMap.values()) {
    //     System.out.println("Value: " + value);
    // }

    //It's entrySet() which almost same work as while loop int this program.
    for (Map.Entry<Integer, Integer> entry : mHashMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

        // Fetch and print the values
        // System.out.print("Enter number of queries: ");
        // int q = sc.nextInt();
        // System.out.print("Enter your queries: ");
        // while (q-- > 0) {
        //     int num = sc.nextInt();
        //     // Fetch and print the result
        //     System.out.print("Ans : ");
        //     System.out.println(+mHashMap.getOrDefault(num, 0));
        //     System.out.print("Next queries : ");
        // }
        sc.close();
    }
}
