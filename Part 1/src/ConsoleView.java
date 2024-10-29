//import java.util.Scanner;
//public class ConsoleView {
    //displays information
    //gather input
    //front of your project
    //output in the consule
//}
import java.util.Scanner;
public class ConsoleView {
    private Scanner scanner;
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public void showFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
