import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long fs= 0, scc = 1;

        for(int i = 0; i<=n; i++){
            System.out.println(fs);
            long next = fs + scc;
     
            fs=scc;
            scc=next;
        }
        sc.close();
    }
}
