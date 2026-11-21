public class Main {
    public static void main(String[] args) {

        int java = 85;
        int dsa = 90;
        int dbms = 78;

        if (java < 0 || java > 100 ||
            dsa < 0 || dsa > 100 ||
            dbms < 0 || dbms > 100) {

            System.out.println("Invalid Marks");

        } else {

            double percentage = (java + dsa + dbms) / 3.0;

            if (java >= 40 && dsa >= 40 && dbms >= 40) {

                if (percentage >= 90) {
                    System.out.println("Excellent - Grade A+");
                } else if (percentage >= 80) {
                    System.out.println("Grade A");
                } else if (percentage >= 70) {
                    System.out.println("Grade B");
                } else if (percentage >= 60) {
                    System.out.println("Grade C");
                } else {
                    System.out.println("Grade D");
                }

            } else {
                System.out.println("Fail");
            }

            System.out.println("Percentage: " + percentage);
        }
    }
}
