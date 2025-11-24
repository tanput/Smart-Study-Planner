import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String deadline;
    private boolean completed;

    public Task(int id, String title, String deadline) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDeadline() { return deadline; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + id +
               " | Title: " + title +
               " | Deadline: " + deadline +
               " | Completed: " + completed;
    }
}
