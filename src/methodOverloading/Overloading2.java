package methodOverloading;

public class Overloading2 {
    private String formatNumber(int value) {
        return String.format("%d", value);}
    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }
    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        Overloading2 overloading2 = new Overloading2();
        System.out.println(overloading2.formatNumber(500));
        System.out.println(overloading2.formatNumber(098.9876 + (2)));


    }}
