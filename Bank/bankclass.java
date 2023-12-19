package Bank;

import java.util.Scanner;

public class bankclass {
  Scanner scanner = new Scanner(System.in);

  // Menetapkan saldo awal
  int saldo = 100000;
  int simpan;
  int ambil;

  public void uang() {
    System.out.println("Saldo anda saat ini: Rp." + saldo);
  }

  public void simpanUang() {
    System.out.println("\nMasukkan uang yang ingin disimpan: ");
    int simpan = scanner.nextInt();
    scanner.nextLine();

    // Menambahkan uang ke saldo
    saldo += simpan;

    System.out.println("\nSaldo berhasil ditambahkan");
    System.out.println("Saldo anda saat ini: Rp." + saldo);
  }

  public void getSaldo() {
    System.out.println("\nBerapa uang yang ingin diambil: ");
    int ambil = scanner.nextInt();
    scanner.nextLine();

    // Memeriksa apakah saldo cukup untuk diambil
    if (ambil <= saldo) {
      // Mengurangkan uang dari saldo jika saldo cukup
      saldo -= ambil;
      System.out.println("\nAnda berhasil menarik uang sebesar: Rp." + ambil);
      System.out.println("Saldo anda saat ini: Rp." + saldo + "\n");
    } else {
      System.out.println("\nSaldo tidak mencukupi untuk penarikan");
    }
  }
}
