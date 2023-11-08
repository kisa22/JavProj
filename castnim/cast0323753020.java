public class cast0323753020 {
  public static void main(String[] args) {
    String shirtPrice = "15";
    String taxRate = "0.05";
    String gibberish = "887ds7nds87dsfs";

    double shirtPriceDouble = Double.parseDouble(shirtPrice);
    double taxRateDouble = Double.parseDouble(taxRate);

    System.out.println("Pajak : " + shirtPriceDouble * taxRateDouble);

    try {
      int gibberishInt = Integer.parseInt(gibberish);
      System.out.println("Angka dari gibberish : " + gibberishInt);
    } catch (NumberFormatException e) {
      System.out.println("Konversi gibberish ke int gagal: " + e.getMessage());
    }
  }
}
