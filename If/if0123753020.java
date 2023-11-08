import java.util.Scanner;

public class if0123753020 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan berat barang (kg): ");
    double berat_barang = input.nextDouble();
    input.nextLine();

    System.out.print("Masukkan destinasi pengiriman (Amerika Serikat/Alaska/Hawaii/Luar Amerika Serikat): ");
    String destinasi_pengiriman = input.nextLine();

    double biaya_pengiriman = 0.0;

    if (destinasi_pengiriman.equals("Alaska") || destinasi_pengiriman.equals("Hawaii")) {
      biaya_pengiriman = berat_barang * 10;
    } else if (destinasi_pengiriman.equals("Amerika Serikat")) {
      biaya_pengiriman = berat_barang * 5;
    } else {
      biaya_pengiriman = berat_barang * 10;
    }

    System.out.println("Biaya pengiriman: $" + biaya_pengiriman);

    input.close();
  }
}