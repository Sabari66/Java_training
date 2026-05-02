import java.util.Scanner;

public class todo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tasks = new String[3];

        for (int i = 0; i < 3; i++) {
            tasks[i] = sc.nextLine();
        }

        System.out.println("Your To-Do List:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }
}