package loop;

// do {....} while (condition) == exit control
public class DoWhile {
    public static void main(String[] args) {
        // print 1-10
        int number = 1; // starting
        do {
            System.out.println(number);
            number++; //increment
          }while (number<= 10); // stop
    }
}
