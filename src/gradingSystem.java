public class gradingSystem {
    public static void checkStudentPassOrFail(int marks){
        if (marks>=35 && marks <=50){
            System.out.println(marks + " = " + "student is pass with passClass" );        }
        else if (marks>=51 && marks <= 65) {
            System.out.println(marks + " = " + "student is pass with secondClass" );}
        else if (marks>= 66 && marks <= 75) {
            System.out.println(marks + " = " + "student is pass with firstClass" );}
        else if (marks>= 76 && marks<= 100) {
            System.out.println(marks + " = " + "student is pass with distinction");}
        else {
            System.out.println(marks + " = " + "student is fail" );}     }
    public static void main(String[] args) {
        checkStudentPassOrFail(40);
        checkStudentPassOrFail(94);
        checkStudentPassOrFail(61);
        checkStudentPassOrFail(101);
        checkStudentPassOrFail(12);}}
