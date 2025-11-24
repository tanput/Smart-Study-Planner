import java.io.*;
import java.util.*;

public class TaskManager {
    private List<Task> tasks;
    private final String FILE_NAME = "tasks.dat";

    public TaskManager() {
        tasks = loadTasks();
    }

    public void addTask(Task t) {
        tasks.add(t);
        saveTasks();
    }

    public void markCompleted(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.markCompleted();
                saveTasks();
                return;
            }
        }
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    private void saveTasks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    private List<Task> loadTasks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Task>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
