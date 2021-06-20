import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Identity {

    /**
     * Prints elements with those have same index as their values (Index/s i such that a[ i ] = i)
     *
     * @param arr InputArray(In ascending order)
     * @param p FirstIndex
     */
    static void printIdentityEl(int[] arr, int p) {
        // Checking conditions & Calling printIdentityEl recursively
        if (p < arr.length && p >= 0) {
            if(arr[p] == p) {
                System.out.print(p + " ");  // Prints tha values
            }
            if(p >= arr[p]) {
                printIdentityEl(arr,p+1);   // Calls printIdentityEl recursively
            }
        }
    }

    /**
     * Gives a brief introduction to user
     * Takes the array and the size of the array from the user.
     *
     * @return inputArray
     * @throws IOException
     */
    public static int[] getInputArray() throws IOException{
        // Giving a brief Introduction to the user
        System.out.print("This program will find elements with those have same index as their values" +
                " in given Array Using recursive Algorithm .\n" + "n - " +
                "No. of integers in input Array.\n" + "\nEnter input arr size(n): ");

        // Getting input size from user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // Getting the Input arr from the user
        int[] arr = new int[n];
        int inputSize = 0;
        String input;
        do {
            System.out.print("Enter " + n + " integers, separated using space (n1 n2 n3 ...): ");
            input = reader.readLine();
            inputSize = input.split(" ").length;
        } while (inputSize != n);

        String[] numbers = input.split(" ");
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(numbers[j]);
        }

        return arr;
    }

    /**
     * Prints the given arr
     *
     * @param arr arr which is to be printed
     */
    public static void printInputArray(int[] arr){
        System.out.println("\n" + "Input Array : " + Arrays.toString(arr) );
    }

    /**
     * main
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int[] inputArr = getInputArray();   // Getting the array from the user
        printInputArray(inputArr);  // Prints input array.

        System.out.print("Index/s i such that a[ i ] = i : ");
        printIdentityEl(inputArr,0);// Prints Index/s i such that a[ i ] = i
        System.out.println("\n");

    }
}

