package ArrayTopic;

public class SecondArray {
    public static void main(String[] args) {
        String car1 = "volvo";
        String car2 = "benz";
        String car3 = "mini";
        String car4 = "range rover";

        //index
        String[] arrcars = {"volvo", "benz", "mini", "range rover"};
        int myArrayLength = arrcars.length;
        System.out.println(myArrayLength);

            // to print all car name
        for (int i=0; i<myArrayLength; i++)
        {
            System.out.println(arrcars[i]);}

            // to print all car in reverse
        for (int i=myArrayLength-1; i>=0; i--){
            System.out.println(arrcars[i]);
        }
        }
}
