package prj4_bitsOperations;

import java.util.*;

/**
 * @author Nasir Deshields
 * This class contains the main method to run the project. It prompts the user to enter two positive integers,
 * performs various bitwise operations on them, and repeats the process a fixed number of times.
 */
public class Main {

    /**
     * The main method of the program.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
      runProject();
    }

    /**
     * Method to run the project. It prompts the user to enter two positive integers, performs bitwise operations
     * on them, and repeats the process a fixed number of times.
     */
    public static void runProject(){
        BitOperationsClass b = new BitOperationsClass(); // Object for performing bitwise operations
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        int x, y;
        int testAmount = 5; // Number of times to repeat the process

        System.out.println("Enter two positive integers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 1; i < testAmount; i++) {
            System.out.println(x + " CountOnes: ");
            b.countOnes(x); // Calculate number of ones in binary representation of x
            System.out.println("\n" + y + " CountOnes: ");
            b.countOnes(y); // Calculate number of ones in binary representation of y
            System.out.println();
            b.calculateAND_OR_XOR(x, y); // Calculate bitwise AND, OR, and XOR of x and y
            System.out.println();
            b.shiftLeft(x, 4); // Shift x to the left by 4 bits
            b.shiftLeft(y, 4); // Shift y to the left by 4 bits
            b.shiftSignedRight(x, 4); // Signed right shift of x by 4 bits
            b.shiftUnsignedRight(x, 4); // Unsigned right shift of x by 4 bits
            b.shiftSignedRight(x, 4); // Signed right shift of x by 4 bits
            b.shiftUnsignedRight(y, 4); // Unsigned right shift of y by 4 bits

            System.out.println("\nEnter two positive integers: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close(); // Close the Scanner object
    }
}

