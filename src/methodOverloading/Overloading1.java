package methodOverloading;

public class Overloading1 {
    public void addition (){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);    }
    public static void addition(int a, int b){
        System.out.println(a+b);    }
    public static void addition (int a, int b, int c){
        System.out.println(a+b+c);    }
    public static void addition(String a, String b, String c){
        System.out.println(a+b+c);}
    public static void main(String[] args) {
        Overloading1 overloading1 = new Overloading1();
        Overloading1.addition(10, 20);
        overloading1.addition(50, 60, 80);
        Overloading1.addition("parth", "Prakashbhai", "Modi");
    }
}
