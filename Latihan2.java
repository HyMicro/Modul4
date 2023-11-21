
// Buatlah program text analyzer yang berisikan analisis teks berupa hitung
// jumlah karakter, hitung
// jumlah kata, dan cari kata dalam teks. Implementasikan materi API dalam
// pembuatan program ini ! (Clue:
// isEmpty( ), length( ), split( ), equalsIgnoreCase( ))

import java.util.Scanner;

public class Latihan2 {
    private String teks = "Aigoo"; // Tetapkan nilai awal teks

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Latihan2 textAnalyzer = new Latihan2();

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari buffer

            switch (pilihan) {
                case 1:
                    textAnalyzer.masukkanTeks(scanner);
                    break;
                case 2:
                    textAnalyzer.hitungJumlahKarakter();
                    break;
                case 3:
                    textAnalyzer.hitungJumlahKata();
                    break;
                case 4:
                    textAnalyzer.cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        teks = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private void hitungJumlahKarakter() {
        int jumlahKarakter = teks.length();
        System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter + "\n");
    }

    private void hitungJumlahKata() {
        String[] kataArray = teks.split("\\s+");
        int jumlahKata = kataArray.length;
        System.out.println("Jumlah kata dalam teks: " + jumlahKata + "\n");
    }

    private void cariKata(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String kataCari = scanner.nextLine();
        int jumlahKemunculan = hitungKemunculanKata(kataCari);
        System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + jumlahKemunculan + " kali dalam teks.\n");
    }

    private int hitungKemunculanKata(String kata) {
        String[] kataArray = teks.split("\\s+");
        int jumlahKemunculan = 0;

        for (String k : kataArray) {
            if (k.equalsIgnoreCase(kata)) {
                jumlahKemunculan++;
            }
        }

        return jumlahKemunculan;
    }
}
