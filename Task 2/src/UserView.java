import java.util.List;
import java.util.Scanner;
public class UserView {
    private Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println("options");
        System.out.println("1. Add user");
        System.out.println("2. show all users");
        System.out.println("3. update user");
        System.out.println("4. delete user");
        System.out.println("5. Log out");
        System.out.print("Choose one of the options: ");
    }
    public void displayUsers(List<String> users) {
        System.out.println("List of users:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i));
        }
    }
    public String getUserName() {
        System.out.print("Enter name of user: ");
        return scanner.nextLine();
    }
    public int getUserIndex() {
        System.out.print("Enter number of user: ");
        return scanner.nextInt() - 1;
    }
}
