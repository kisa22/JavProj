package Bank;

public class Bank23753020 {

  int saldo;
  int simpan = 500000;
  int ambil = 150000;

  public Bank23753020(int saldo) {
    this.saldo = saldo;
  }

  public void uang() {
    System.out.println("Saldo anda saat ini: Rp." + saldo + "\n");
  }

  public void simpanUang() {
    System.out.println("Simpan uang " + simpan);
    System.out.println("Saldo saat ini: Rp." + (saldo + simpan) + "\n");
  }

  public void getSaldo() {
    System.out.println("Ambil uang" + ambil);
    System.out.println("Salo saat ini: Rp." + ((saldo + simpan) - ambil) + "\n");
  }
}
