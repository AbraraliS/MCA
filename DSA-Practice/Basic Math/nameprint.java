public class nameprint {
    
    public static int pr(int n) {

      
        if (n==0) {
            return 1;
        }
        System.out.println("abcd");
        return pr(--n);
    }

    public static void main(String[] args) {
        int ss = 10;
        pr(ss);
    }

}
