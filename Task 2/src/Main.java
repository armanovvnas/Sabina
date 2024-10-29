import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserView view = new UserView();
        UserViewModel viewModel = new UserViewModel();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            view.showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    String name = view.getUserName();
                    viewModel.addUser(name);
                    System.out.println("User added.");
                    break;
                case 2:
                    view.displayUsers(viewModel.getUsers());
                    break;
                case 3:
                    view.displayUsers(viewModel.getUsers());
                    int indexToUpdate = view.getUserIndex();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    viewModel.updateUser(indexToUpdate, newName);
                    System.out.println("User updated.");
                    break;
                case 4:
                    view.displayUsers(viewModel.getUsers());
                    int indexToRemove = view.getUserIndex();
                    viewModel.removeUser(indexToRemove);
                    System.out.println("User deleted.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Log out.");
                    break;
                default:
                    System.out.println("Incorrect. Please, try it again.");
            }
        }
        scanner.close();
    }
}
