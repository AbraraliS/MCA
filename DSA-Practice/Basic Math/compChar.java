public class compChar {

    public static int f(String c, String[] s) {
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(c)) { // Use .equals() for string comparison
                cnt++;
            }
            
        }
        System.out.println("Count of '" + c + "': " + cnt);
        return cnt;
    }

    public static void main(String[] args) {
        String c = "a";

        // Split the string into individual characters and store them as an array of strings
        String[] m = "bcdefgaa".split("");

        f(c, m);
    }
}
