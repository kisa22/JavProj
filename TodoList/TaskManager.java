import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
  private ArrayList<Task> tasks;

  public TaskManager() {
    tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
    System.out.println("Tugas ditambahkan: " + task.getDescription());
    System.out.println("Tugas anda berhasil ditambahkan");
    System.out.println("");
  }

  public void displayTasks() {
    System.out.println("Daftar Tugas:");
    for (int i = 0; i < tasks.size(); i++) {
      Task task = tasks.get(i);
      String status = task.isDone() ? "Selesai" : "Belum Selesai";
      System.out.println(i + ". Deskripsi: " + task.getDescription() + ", Status: " + status);
    }
  }

  public void markTaskAsDone(int index) {
    if (index >= 0 && index < tasks.size()) {
      Task task = tasks.get(index);
      task.markAsDone();
      System.out.println("Tugas ditandai sebagai selesai: " + task.getDescription());
      System.out.println("");
    } else {
      System.out.println("Indeks tugas tidak valid.");
    }
  }

  public void removeTask(int index, TaskManager taskManager, Scanner scanner) {
    if (index >= 0 && index < tasks.size()) {
      Task removedTask = tasks.remove(index);
      System.out.println("Tugas dihapus: " + removedTask.getDescription());
      System.out.println("");
      displayTasks();
    } else {
      System.out.println("Indeks tugas tidak valid.");
    }
  }
}
