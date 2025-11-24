import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SMART STUDY PLANNER =====");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task Completed");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Deadline (YYYY
