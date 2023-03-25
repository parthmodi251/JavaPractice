package ArrayTopic;

public class FirstArray1 {
    public static void main(String[] args) {

        int [] arr = {23,23,23,1235,65,54,543};

        arr[0]=50;
        arr[1]= arr[0]+ arr[3];
        System.out.println(arr[1]);
        //if-else

        if (arr[0]>arr[1]){
            System.out.println("first position is bigger");
        }else {
            System.out.println("second position is bigger");
        }

    }
}
