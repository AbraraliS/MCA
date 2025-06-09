// Find the lenghth pf sub array with given sum
public class q10 {
    int maxLength(int[] arr, int n, int sum) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        q10 obj = new q10();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 9;
        System.out.println("Length of longest subarray with sum " + sum + " is: " + obj.maxLength(arr, n, sum));
    }
}
