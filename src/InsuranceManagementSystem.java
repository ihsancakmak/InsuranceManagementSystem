import java.util.Scanner;

public class InsuranceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();


        User user1 = new User("Ali", "Cakmak", "ali.cakmak@example.com", "password123", "Engineer", 30);
        Individual account1 = new Individual(user1);
        accountManager.addAccount(account1);

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);

        if (loggedInAccount != null) {
            System.out.println("Login successful!");
            loggedInAccount.showUserInfo();
        } else {
            System.out.println("Invalid email or password.");
        }

        scanner.close();
    }
}
