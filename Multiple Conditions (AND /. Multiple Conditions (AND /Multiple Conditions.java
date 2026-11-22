
public class Main {
    public static void main(String[] args) {

        int age = 25;
        double salary = 35000;
        int creditScore = 750;

        if (age >= 21 &&
            salary >= 25000 &&
            creditScore >= 700) {

            System.out.println("Loan Approved");

        } else {
            System.out.println("Loan Rejected");
        }
    }
}
