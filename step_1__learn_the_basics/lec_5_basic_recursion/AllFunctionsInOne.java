package step_1__learn_the_basics.lec_5_basic_recursion;

public class AllFunctionsInOne {

    void printNumbers(int n) {
        if (n == 1)
            System.out.print(n + " ");
        else {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    void printGfg(int N) {
        if (N < 1)
            return;
        printGfg(N - 1);
        System.out.print("GFG ");
    }

    void printNTo1(int N) {
        if (N < 1)
            return;
        System.out.print(N + " ");
        printNTo1(N - 1);
    }

    long sumOfSeries(long n) {
        if (n == 1)
            return 1;
        return (n * n * n) + sumOfSeries(n - 1);
    }

    void reverseArrayUsingExtraArray(int arr[], int output[], int n) {
        if (n < 0)
            return;
        reverseArrayUsingExtraArray(arr, output, n - 1);
        output[n] = arr[(arr.length - 1) - n];
    }

    void reverArray(int arr[], int start, int end) {
        if (start > end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverArray(arr, start + 1, end - 1);
    }

    boolean isPalindrome(String str, int start, int end) {
        if (start > end)
            return true;
        else if (str.charAt(start) == str.charAt(end))
            return isPalindrome(str, start + 1, end - 1);
        return false;
    }

    int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        AllFunctionsInOne rc = new AllFunctionsInOne();

        // rc.printNumbers(5);
        // rc.printGfg(3);
        // rc.printNTo1(10);
        // rc.sumOfSeries(5); //1cube + 2cube + 3cube + 4cube + 5cube = 225

        // reversing array using extra array
        // int arr[] = {10, 20, 30, 40, 50, 60};
        // int output[] = new int[arr.length];
        // rc.reverseArrayUsingExtraArray(arr, output, arr.length -1 );
        // for(int i=0; i<output.length; i++){
        // System.out.print(output[i] + ", ");
        // }

        // reversing using only one array
        // rc.reverArray(arr, 0, arr.length-1);
        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i] + ", ");
        // }

        // String input = "raceacar";
        // System.out.println(input+ " is palindrome : "+ rc.isPalindrome(input, 0,
        // input.length()-1));

        System.out.println("factorial of 5 is " + rc.factorial(5));

    }

}