package appserver.job.impl;

/**
 * Class [FibonacciHelper] Helper class for Fibonacci that demonstrates that dependent
 * classes are loaded automatically when a class is loaded (Fibonacci in this case)
 *
 * @author Scott Ames
 */
public class FibonacciHelper {

    int number;

    public FibonacciHelper(int number) { this.number = number; }

    /**
     * Method [getFibonacci] Get Fibonacci of number in O(n) time using O(1) space
     *
     * @return integer result of fibonacci algorithm
     */
    public int getFibonacci() {
        int[] lastTwo = {0, 1};
        int counter = 2;
        while (counter <= number) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return number > 0 ? lastTwo[1] : lastTwo[0];
    }
}
