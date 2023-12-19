package Bank;

import java.util.Scanner;

public class Bankkita {

  public static void main(String[] args) {
    bankclass bank = new bankclass();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nSelamat datang di Bank23753020");
      bank.uang();

      System.out.println("\nMenu");
      System.out.println("1. Simpan uang");
      System.out.println("2. Ambil uang");
      System.out.println("3. Keluar\n");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          bank.simpanUang();
          break;
        case 2:
          bank.getSaldo();
          break;
        case 3:
          System.out.println("Keluar dari Aplikasi.");
          System.exit(0);
        default:
          System.out.println("\nTerjadi kesalahan pada sistem");
          break;
      }
    }

  }
}
