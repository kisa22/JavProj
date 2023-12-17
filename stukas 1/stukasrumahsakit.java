import java.util.Scanner;

public class stukasrumahsakit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String statuspasien;
    int biayadaftarpasien;
    String namakamar;
    int biayakamar;
    String namadokter;
    int biayapemeriksaan;
    int diskon;
    double totalbayar;

    // input
    System.out.println("Program Cek Pasien");
    System.out.println("Masukkan Kode Pasien");
    String kodepasien = input.nextLine();
    System.out.println("Masukkan Kode Kamar");
    int kodekamar = input.nextInt();
    System.out.println("Masukkan Kode Dokter");
    String kodedokter = input.nextLine();
    System.out.println("Berapa lama pasien menginap");
    int lamamenginap = input.nextInt();

    // int durasi
      switch (kodepasien) {
          case "PS0001" -> {
              statuspasien = "Pasien Baru";
              biayadaftarpasien = 500000;
          }
          case "PS0002" -> {
              statuspasien = "Pasien Lama";
              biayadaftarpasien = 400000;
          }
          case "PS0003" -> {
              statuspasien = "Pasien BPJS";
              biayadaftarpasien = 300000;
          }
          case "PS0004" -> {
              statuspasien = "Pasien Akses";
              biayadaftarpasien = 200000;
          }
          case null, default -> {
              statuspasien = "kosong";
              biayadaftarpasien = 0;
          }
      }
      
    if (kodekamar == 1111) {
      namakamar = "Kamar Melati";
      biayakamar = 1000000;
    } else if (kodekamar == 2222) {
      namakamar = "Kamar Mawar";
      biayakamar = 2000000;
    } else if (kodekamar == 3333) {
      namakamar = "Kamar Dahlia";
      biayakamar = 3000000;
    } else if (kodekamar == 4444) {
      namakamar = "Kamar Anggrek";
      biayakamar = 4000000;
    } else {
      namakamar = "kosong";
      biayakamar = 0;
    }

      switch (kodedokter) {
          case "DK001" -> {
              namadokter = "DR Andi";
              biayapemeriksaan = 500000;
          }
          case "DK002" -> {
              namadokter = "DR Joko";
              biayapemeriksaan = 400000;
          }
          case "DK003" -> {
              namadokter = "DR Karni";
              biayapemeriksaan = 300000;
          }
          case "DK004" -> {
              namadokter = "DR Amin";
              biayapemeriksaan = 200000;
          }
          case "DK005" -> {
              namadokter = "DR.l Udin";
              biayapemeriksaan = 100000;
          }
          case null, default -> {
              namadokter = "kosong";
              biayapemeriksaan = 0;
          }
      }

    // proses perhitungan diskon
    if (lamamenginap > 10) {
      diskon = 50;
    } else if (lamamenginap > 8) {
      diskon = 40;
    } else if (lamamenginap > 6) {
      diskon = 30;
    } else if (lamamenginap > 4) {
      diskon = 20;
    } else if (lamamenginap > 1) {
      diskon = 10;
    } else {
      diskon = 0;
    }

    // hitung diskon
    int hasil = biayakamar * diskon / 100;

    // proses perhitungan biaya
    totalbayar = (biayadaftarpasien + biayakamar + biayapemeriksaan - hasil);

    // output
    System.out.println("Status Pasien: " + statuspasien);
    System.out.println("Jumlah Biaya Pendaftaran Pasien: " + biayadaftarpasien);
    System.out.println("Nama Kamar: " + namakamar);
    System.out.println("Jumlah Biaya Kamar: Rp." + biayakamar);
    System.out.println("Nama Dokter: " + namadokter);
    System.out.println("Biaya Pemeriksaan: Rp." + biayapemeriksaan);
    System.out.println("Selamat Anda Mendapatkan Diskon Sebesar " + diskon + "%");
    System.out.println("Bayar menginap anda : Rp." + hasil);
    System.out.println("Total Biaya Yang Anda Bayar: Rp." + totalbayar);
  }
}