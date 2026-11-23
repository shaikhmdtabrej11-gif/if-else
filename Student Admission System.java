public class Main {
    public static void main(String[] args) {

        int age = 20;
        int marks = 85;
        boolean entranceExam = true;

        if (age >= 18) {

            if (marks >= 60) {

                if (entranceExam) {
                    System.out.println("Admission Approved");
                } else {
                    System.out.println("Entrance Exam Required");
                }

            } else {
                System.out.println("Insufficient Marks");
            }

        } else {
            System.out.println("Age Criteria Not Met");
        }
    }
}
