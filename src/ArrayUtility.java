import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
public class ArrayUtility {
public static void main(String[] args){
    int[] arrayOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    shiftRightNTimes(arrayOne, 2);
}
    public static void print(int[] array) {
        System.out.println(array);
    }

    public static int sum(int[] array) {
        int test = 0;
        for (int i : array) test+=i;
        return test;
    }

    public static double average(int[] array) {
        double test = 0;
        for (int i : array) test+=i;
        test = test/array.length;
        BigDecimal g = new BigDecimal(test).setScale(2, RoundingMode.DOWN);
        double gg = g.doubleValue();
        return gg;
    }

    public static int minimum(int[] array) {
        int test = array[0];
        for (int i : array) if (i<test) test = i;
        return test;
    }

    public static int maximum(int[] array) {
        int test = array[0];
        for (int i : array) if (i>test) test = i;
        return test;
    }

    public static int evenCount(int[] array) {
       int check = 0;
       for (int i : array) if(i%2==0) check++;
       return check;
    }

    public static int[] reverseOne(int[] array) {
    int[] test = new int[array.length];
    for(int i = 0; i<array.length; i++){
        test[i] = array[array.length-i-1];
    }
        return test;
    }

    public static void reverseTwo(int[] array) {
        int[] test = new int[array.length];
        for(int i = 0; i<array.length; i++){
            test[i] = array[array.length-i-1];
        }
        for(int i = 0; i<array.length; i++){
            array[i] = test[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i<array.length; i++){
            if(array[i] == num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i<array.length; i++){
            if(array[i] == str) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) { //not tested
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) { //not tested
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String newStr = "";
        for (int i = 0; i<array.length-1; i++){
            newStr = newStr + array[i] + ", ";
        }
        newStr += array[array.length-1];
        return newStr;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i]+array[j]==num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] test = new int[array.length];
        for(int i = 0; i<array.length; i++){
            if(i==0) test[i] = array[array.length-1];
            else test[i] = array[i-1];
        }
        System.out.println(Arrays.toString(test));
        for(int i = 0; i<array.length; i++){
            array[i] = test[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftLeft(int[] array) {
        int[] test = new int[array.length];
        for(int i = 0; i<array.length-1; i++){
            if(i==0) test[i] = array[1];
            else test[i] = array[i+1];
        }
        test[array.length-1] = array[0];
        System.out.println(Arrays.toString(test));
        for(int i = 0; i<array.length; i++){
            array[i] = test[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int last = array[array.length-1];
            for (int j = array.length-1; j >0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }
}
