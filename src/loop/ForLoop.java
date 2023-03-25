package loop;
// difference between while and do while
// while (condition) {.....} == entry control
// do {....} while (condition) == exit control
// ForLoop == flow - starting--> checking --> execute the code --> increment /decrement
public class ForLoop {
    public static void main(String[] args) {
        //int number;
      //  flow - starting--> checking --> execute the code --> increment /decrement
        //for (number = 1; number <= 10; number++){
          //  System.out.println(number);

        for (int number = 0; number <= 50; number+=2){
            if (number%2==0){
                System.out.println(number + "is even number");
            }
        }
        }

    }

