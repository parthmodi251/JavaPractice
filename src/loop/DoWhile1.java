package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int numer = 100000;
        do {
            System.out.println(numer);
            numer--;
        } while (numer>=10 * 99999);
    }
}
