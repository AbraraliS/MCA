public class fibboR {
    
    public static int fib(int n){
        if (n<=1) {
            return n;
        }

        int fs =fib(n-1);
        int sc = fib(n-2);

        return fs + sc;


    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

}
