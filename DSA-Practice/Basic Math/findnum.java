

public class findnum {
    public static int f(int num, int a[]){
        int cnt =0;
        int n = a.length;
        for(int i = 0; i<n; i++){
            if (num == a[i]) {
                cnt = cnt + 1;
                System.out.println(cnt);
            }
        }
                return cnt;
    }

    public static void main(String[] args) {
       
       
       int a[] = {1,2,3,1,1,2,1};
       
        f(1, a);
    }
}
