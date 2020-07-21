import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class recursion {

    public static void main(final String[] args) {

        //countDown(10);
        //String word = "123456789";
        //reverse(word);
        //var result = factorial(5);
        //var result = fibonacci(6);

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(1);
        set1.add(3);

    }

    private static void countDown(int num) {

        if (num == 0) {
            System.out.println("----- BASE CASE --------");
            return;
        }
        System.out.println(num + "\n");
        countDown(num - 1);
    }

    private static void reverse(String word) {

        if (word.length() <= 0) {
            System.out.println("----- BASE CASE --------");
            return;
        }

        String lastWord = Character.toString(word.charAt(word.length() - 1)); // pick the last word
        System.out.print(lastWord + "\n");
        String remainingWord = word.substring(0, word.length()-1); //remove the last word
        reverse(remainingWord);
    }

    private static int factorial(int num) {

        if (num == 0 ) {
            System.out.println("----- BASE CASE when Num = 0--------");
            System.out.println("factorial[0] = 1");
            return 1;
        }

        // 5! = 5 * 4 * 3 * 2 * 1
        System.out.println(" Recursion pushed. num: " + num);
        int returnedVal = factorial(num - 1);
        int current = num * returnedVal;
        System.out.print( " | " + num + "*" + returnedVal + "= current: " + current + "\n");

        return current;

    }

    private static int fibonacci(int num) {

        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        }

        System.out.println(" Recursion pushed. num: " + num);
        int retVal = fibonacci(num-1);

        System.out.print(" second recursion num:" +num );

        int retVal1 = fibonacci(num - 2);

        // f(n-1) + fn(n-2)
        int compute =  retVal1 + retVal;
        System.out.println(" -----------------| compute = " + retVal + " + " + retVal1 + " = " + compute);

        return compute;
    }
    public static ArrayList<String> TowerOfHanoi(int n, int from, int aux, int to, ArrayList<String> arr) {
        if (n < 1) {
            return arr;
        }
        arr = recursion.TowerOfHanoi(n-1, from,to, aux, arr);
        // move from A to C using B
        arr.add(from + ","+to);
        arr = recursion.TowerOfHanoi(n-1, aux, from, to, arr);
        return arr;
    }

    public StringBuilder ReverseString(String s) {

        if(s.isEmpty())
            return new StringBuilder();

        StringBuilder sb = ReverseString(s.substring(1));
        sb.append(s.charAt(0));
        System.out.println("s : " + s + " | sb: " + sb);
        return sb;
    }
}