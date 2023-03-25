package ArrayTopic;

public class FirstArray {
    public static void main(String[] args) {

        int [] arr = {23,23,23,1235,65,54,543}; //array
            //index    0  1  2 3     4  5  6
        //access
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        // operations
        arr[0]=50;
        arr[1]= arr[0]+ arr[3];
        System.out.println(arr[2]);
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[6]);


    }
}
