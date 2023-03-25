package oops1;

public class parentClass extends childClass {
    int a = 10;
    int b = 20;
    public void myMethod1(){
        System.out.println("this is a parent class");
    }

    public static void main(String[] args) {
        childClass childClass = new childClass();
        parentClass parentClass = new parentClass();
        System.out.println(parentClass.a);
        System.out.println(parentClass.b);
        parentClass.myMethod1();
        childClass.myMethod();
           }
}
