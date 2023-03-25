package ArrayTopic;

import java.util.Arrays;

public class ArraySmallestLongestNumber {
    public static void main(String[] args) {
        int array[] = {10,23,54,56,99,2,4,6};
        int size = array.length;

        Arrays.sort(array);

        int smallest = array[0];
        int longest = array[size-1];
        System.out.println("smallest elements is = " + smallest);
        System.out.println("longest elements is = " + longest);
    }
}
