package Mtk;

public class Matematika {
  public static void main(String[] args) {
    // Mtk23753020 mate = new Mtk23753020(20, 10);
    Mtk23753020 mate = new Mtk23753020();

    // mate.jumlah();
    // mate.mines();
    // mate.ngali();
    // mate.kebagi();

    mate.pertambahan(20, 20);
    mate.pengurangan(10, 5);
    mate.perkalian(10, 20);
    double hasilBagi = mate.pembagian(21, 2);

    System.out.println("21 / 2: " + hasilBagi);
  }
}
