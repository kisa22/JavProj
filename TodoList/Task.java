public class Task {
  private String description;
  private boolean isDone;

  public Task(String description) {
    this.description = description;
    this.isDone = false; // Awalnya, tugas belum selesai
  }

  public String getDescription() {
    return description;
  }

  public boolean isDone() {
    return isDone;
  }

  public void markAsDone() {
    isDone = true;
  }

  public int size() {
    return 0;
  }

  public Task remove(int index) {
    return null;
  }
}
