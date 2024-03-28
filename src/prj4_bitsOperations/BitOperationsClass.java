package prj4_bitsOperations;

/**
 * This class provides methods for performing various bitwise operations on integers.
 */
public class BitOperationsClass {
    
    /**
     * Empty Constructor for the BitOperationsClass.
     */
    public BitOperationsClass(){}

    /**
     * Method to count the number of ones in the binary representation of an integer.
     *
     * @param a
     */
    public void countOnes(int a){
        int temp = a;
        int countOnes = 0;
        int value = 0;

        while(temp > 0){
           value = temp & 1;
            if(value == 1){
                countOnes++;
            }
            temp /= 2;
           System.out.println("reduced_x: " + temp + "  ones: " + countOnes);
        }

        System.out.println(countOnes + " ones");
    }

    /**
     * Method to calculate bitwise AND, OR, and XOR of two integers.
     *
     * @param a
     * @param b
     */
    public void calculateAND_OR_XOR(int a, int b){

        int andCount = a & b;
        int orCount = a | b;
        int xorCount = a^b;

        System.out.println("and: " + andCount + "\nor: " + orCount + "\nxor: " + xorCount);
    }

    /**
     * Method to perform left shift operation on an integer.
     *
     * @param a
     * @param shiftNum
     */
    public void shiftLeft(int a, int shiftNum){
        int value = a << shiftNum;

        System.out.println(a + " shiftLeft " + shiftNum + ": " + Integer.toBinaryString(value) + " = " + value);
    }

    /**
     * Method to perform unsigned right shift operation on an integer.
     *
     * @param a
     * @param shiftNum
     */
    public void shiftUnsignedRight(int a, int shiftNum){
        int value = a >>> shiftNum;

        System.out.println(a + " unsignedShiftRight " + shiftNum  + ": " + Integer.toBinaryString(value) + " = " + value);
    }

    /**
     * Method to perform signed right shift operation on an integer.
     *
     * @param a
     * @param shiftNum
     */
    public void shiftSignedRight(int a, int shiftNum){
        int value = a >> shiftNum;

        System.out.println(a + " signedShiftRight " + shiftNum  + ": " + Integer.toBinaryString(value) + " = " + value);
    }
}
