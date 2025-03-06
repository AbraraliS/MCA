class FactorialSteps {

    // Recursive method to calculate factorial and show steps
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            System.out.println("Reached base case: factorial(" + n + ") = 1");
            return 1;
        }

        System.out.println("Calculating factorial(" + n + "): " + n + " * factorial(" + (n - 1) + ")");
        int result = n * factorial(n - 1); // Recursive call
        System.out.println("Result of factorial(" + n + ") = " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Number for which factorial is calculated
        System.out.println("Factorial Calculation Steps:");
        int result = factorial(number); // Call recursive method
        System.out.println("\nThe factorial of " + number + " is: " + result);
    }
}
