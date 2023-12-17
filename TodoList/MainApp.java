import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    TaskManager taskManager = new TaskManager();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nPilih operasi:");
      System.out.println("1. Tambah Tugas");
      System.out.println("2. Tampilkan Daftar Tugas");
      System.out.println("3. Tandai Tugas sebagai Selesai");
      System.out.println("4. Keluar");
      System.out.println("");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Membuang newline setelah nextInt()
      System.out.println("");

      switch (choice) {
        case 1:
          System.out.print("Masukkan Deskripsi Tugas: ");
          String description = scanner.nextLine();
          Task newTask = new Task(description);
          taskManager.addTask(newTask);

          displayNewTask(taskManager, scanner);

          break;
        case 2:
          taskManager.displayTasks();
          displayTaskOptions(taskManager, scanner);
          break;
        case 3:
          System.out.print("Masukkan Indeks Tugas yang Selesai: ");
          int taskIndex = scanner.nextInt();
          taskManager.markTaskAsDone(taskIndex);
          break;
        case 4:
          System.out.println("Keluar dari Aplikasi.");
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
          System.out.println("");
      }
    }
  }

  private static void displayNewTask(TaskManager taskManager, Scanner scanner) {
    while (true) {
      System.out.println("Opsi Tugas Lainnya: ");
      System.out.println("1. Tambah tugas");
      System.out.println("2. Tampilkan daftar tugas");
      System.out.println("3. Kembali ke menu utama");
      System.out.println("");

      int selectIndex = scanner.nextInt();
      scanner.nextLine();

      switch (selectIndex) {
        case 1:
          System.out.print("Masukkan Deskripsi Tugas: ");
          String description = scanner.nextLine();
          Task newTask = new Task(description);
          taskManager.addTask(newTask);
          break;
        case 2:
          taskManager.displayTasks();
          displayTaskOptions(taskManager, scanner);
          break;
        case 3:
          main(taskManager, scanner);
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
          System.out.println("");
      }
    }
  }

  private static void displayTaskOptions(TaskManager taskManager, Scanner scanner) {
    while (true) {
      System.out.println("\nOpsi Tugas Lainnya:");
      System.out.println("1. Tambah Tugas Baru");
      System.out.println("2. Hapus Tugas");
      System.out.println("3. Kembali ke Menu Utama");
      System.out.println("");

      int option = scanner.nextInt();
      scanner.nextLine(); // Membuang newline setelah nextInt()

      switch (option) {
        case 1:
          System.out.print("Masukkan Deskripsi Tugas Baru: ");
          String newDescription = scanner.nextLine();
          Task newTask = new Task(newDescription);
          taskManager.addTask(newTask);
          break;
        case 2:
          System.out.print("Masukkan Indeks Tugas yang Akan Dihapus: ");
          int taskIndex = scanner.nextInt();
          taskManager.removeTask(taskIndex, taskManager, scanner);
          displayTaskOptions(taskManager, scanner);
          break;
        case 3:
          main(taskManager, scanner);
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
      }
    }
  }

  private static void main(TaskManager taskManager, Scanner scanner) {
    while (true) {
      System.out.println("\nPilih operasi:");
      System.out.println("1. Tambah Tugas");
      System.out.println("2. Tampilkan Daftar Tugas");
      System.out.println("3. Tandai Tugas sebagai Selesai");
      System.out.println("4. Keluar");
      System.out.println("");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Membuang newline setelah nextInt()
      System.out.println("");

      switch (choice) {
        case 1:
          System.out.print("Masukkan Deskripsi Tugas: ");
          String description = scanner.nextLine();
          Task newTask = new Task(description);
          taskManager.addTask(newTask);

          displayNewTask(taskManager, scanner);

          break;
        case 2:
          taskManager.displayTasks();
          displayTaskOptions(taskManager, scanner);
          break;
        case 3:
          System.out.print("Masukkan Indeks Tugas yang Selesai: ");
          int taskIndex = scanner.nextInt();
          taskManager.markTaskAsDone(taskIndex);
          break;
        case 4:
          System.out.println("Keluar dari Aplikasi.");
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
          System.out.println("");
      }
    }
  }
}
