//  package Hash;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();    
        }

        //precompute

        int hash[] = new int[13];
        for(int i = 0; i<n; i++){
            hash[a[i]]+=1;
        }

        int q = sc.nextInt();
        // int s = a.length;
        while (q-- != 0) {
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }
        sc.close();
        return;

        
    
    }
   
}
