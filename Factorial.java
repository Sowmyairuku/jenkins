public class Factorial {
    public static void main(String[] args) {
        int num = 5; // number to find factorial of
        long fact = 1; // use long for larger results

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
