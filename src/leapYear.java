public class leapYear {
    public static void checkLeapYear (int year){
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0)
                    System.out.println("year" + " " + year + " "  + "it's a leapYear.");
                else
                    System.out.println("year"+ " "  + year + " "  + "it's not a leapYear");
            else
                System.out.println("year"+ " " + year + " "  + " it's not a leapYear");
        else
            System.out.println("year"+ " " + year + " "  +"it's not a leapYear");}
    public static void main(String[] args) {
        checkLeapYear(2000);
        checkLeapYear(2008);
        checkLeapYear(1200);
        checkLeapYear(1989);
        checkLeapYear(2024);}}
