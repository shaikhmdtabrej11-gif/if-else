
public class Main {
    public static void main(String[] args) {

        String username = "admin";
        String password = "12345";

        if (username.equals("admin")) {

            if (password.equals("12345")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }

        } else {
            System.out.println("Invalid Username");
        }
    }
}
