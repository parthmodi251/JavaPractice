package oops1;
 class allConstructor {
    //Constructor - block of the statement, name of the class,when we create object this constructor is called(automatically called)
    //              no return - parameterized constructor
    //method - block of statement, choose your name, we have to manually called the method
                //  we can return - parameterized method
    int myMethod1 (int a, int b){
        int c = 35;
        return b;}
    public allConstructor(){}
    allConstructor(int b) {
        System.out.println(b + "constructor is called");
    }
    public static void main(String[] args) {
        allConstructor allConstructor1 = new allConstructor(20);
        System.out.println(allConstructor1.myMethod1(20,50));}}
