package oops1;

public class constructor2 {
    String studentName;
    int studentId;
    constructor2(String name, int id){
        studentName = name;
        studentId = id;    }
     public void displayDetails(){
        System.out.println("student name is" + " " + "=======" + " " + studentName);
        System.out.println("student id is"+ " " + "======" + " " + studentId);
    }

    public static void main(String[] args) {
        constructor2 constructor2 = new constructor2("Parth",25 );
        constructor2.displayDetails();}}
