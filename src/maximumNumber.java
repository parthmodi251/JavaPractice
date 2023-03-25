public class maximumNumber {
    int a = 65; int b = 43;    int c = 34;     int d = 12;
    public static void maximumNumber (int a, int b, int c, int d){
        if (a!=b && a!=c && a!=d){
            if (a>b && a>c && a>d){
                System.out.printf(a + " " + "is the biggest number");
            } else if (b>c && b>d) {
                System.out.printf(b +" is bigger number");
            } else if (c>d) {
            }else {
                System.out.printf(c + "is bigger number");
            }        }}
    public static void main(String[] args) {
        maximumNumber(65,43,34,12);
        maximumNumber (12,4,45,34);
        maximumNumber(70,10, 21,86);
    }
}
