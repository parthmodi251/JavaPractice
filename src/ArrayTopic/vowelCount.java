package ArrayTopic;

public class vowelCount {
    public static void main(String[] args) {
        String name  = "Parth prakashbhai modi";
        char ch  =  name.charAt(0);
        int count =0;
        System.out.println(ch);

        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) =='a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'||
                    name.charAt(i) == 'u') {
                count++;
            }}
        System.out.println(count);
    }
}
