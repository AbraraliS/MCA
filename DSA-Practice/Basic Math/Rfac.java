public class Rfac {

    public static int fact(int n){

        if (n==0) {
            return 1;
        }

        int res = n * fact(n-1);
        return res;


    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fact(n));

    }
    
}