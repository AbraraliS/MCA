public class RnNUm {
    
    // public static int num(int n, int cur){
    //     if(cur>n){
    //         return 1;
    //     }
    //     System.out.println(cur);
    //     return num(n,cur+1);

      
        
    // }


    public static void printNumbers(int n) {
        if (n < 1) { 
            return  ;
        }
        printNumbers(n - 1); 
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        // num(n);
        printNumbers(n); 
    }


}
