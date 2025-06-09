public class SetZeroToEnd1 {

    public static int[] setZeroToEnd1(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c++;
            }
            else {
                if (c > 0) {
                    int t = a[i];
                    a[i] = 0;
                    a[i - c] = t;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 0,3,0,2};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        setZeroToEnd1(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}