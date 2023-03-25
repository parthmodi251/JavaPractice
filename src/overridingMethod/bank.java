package overridingMethod;

public class bank {
    int getStudentLoanROI (){
        return 0;
    }
    public static void main(String[] args) {

        bankSBI bankSBI = new bankSBI();
        bankHDFC bankHDFC = new bankHDFC();
        bankICCI bankICCI = new bankICCI();
        System.out.println("SBI Student Loan ROI" + " " + bankSBI.getStudentLoanROI());
        System.out.println("ICCI Student Loan ROI" + " " + bankICCI.getStudentLoanROI());
        System.out.println("HDFC Student Loan ROI" + " " + bankHDFC.getStudentLoanROI());
}}
