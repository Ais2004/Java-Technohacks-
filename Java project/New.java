import java.util.*;

public class New {
    public static void main(String args[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();
        System.out.println("YOU CAN PERFORM 1.ADD TASKS  2.REMOVE TASKS  3.SHOW  4.DELETE  5.EXIT");
        int ch = 0;
        while (ch != 5) {
            System.out.println("Choose an option:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addTask(list, c);
                    break;
                case 2:
                    removeTask(list, c);
                    break;
                case 3:
                    showTask(list, c);
                    break;
                case 4:
                    deleteTask(list, c);
                    break;
                case 5:
                    exitTask();
                    break;
            }
        }
    }

    public static void addTask(ArrayList<Task> list, int c) {
        Scanner sc = new Scanner(System.in);
        c++;
        System.out.println("Enter new task:");
        String description = sc.next();
        System.out.println("Enter date and time to finish this task (format: yyyy-MM-dd HH:mm):");
        String dateTime = sc.next();
        Task task = new Task(c, description, dateTime);
        list.add(task);
        System.out.println("Your new task numbered " + c + " is added to the list");
    }

    public static void removeTask(ArrayList<Task> list, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task number you want to remove:");
        int rem = sc.nextInt();
        if (rem >= 1 && rem <= list.size()) {
            list.remove(rem - 1);
            System.out.println("Task removed from the list");
        } else {
            System.out.println("Invalid task number");
        }
    }

    public static void showTask(ArrayList<Task> list, int c) {
        if (list.isEmpty()) {
            System.out.println("Task list is empty");
        } else {
            System.out.println("Tasks:");
            for (Task task : list) {
                System.out.println(task);
            }
        }
    }

    public static void exitTask() {
        System.out.println("EXITED");
    }

    public static void deleteTask(ArrayList<Task> list, int c) {
        list.clear();
        System.out.println("All tasks deleted");
    }
}

class Task {
    private int number;
    private String description;
    private String dateTime;

    public Task(int number, String description, String dateTime) {
        this.number = number;
        this.description = description;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Task " + number + ": " + description + " (Due: " + dateTime + ")";
    }
}
