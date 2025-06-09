package LeetCode;

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
        
            int sum = bitA + bitB + carry;
              result.append(sum  % 2);
            carry = sum / 2;
          
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "10010110";
        String b = "100101";
        String result = addBinary(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + result);
    }
}
