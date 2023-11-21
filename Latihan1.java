// // Buatlah program kalkulator yang berisikan operasi perhitungan akar
// kuadrat, pangkat, logaritma
// // natural (basis e), dan factorial. Implementasikan materi API dalam
// pembuatan program ini ! (Clue:
// // Math.sqrt, Math.pow, Math.log)

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    akarKuadrat();
                    break;
                case 2:
                    pangkat();
                    break;
                case 3:
                    logaritma();
                    break;
                case 4:
                    faktorial();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void akarKuadrat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.sqrt(angka);
        System.out.println("Hasil akar kuadrat dari " + angka + " adalah " + hasil);
    }

    private static void pangkat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double pangkat = scanner.nextDouble();
        double hasil = Math.pow(angka, pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }

    private static void logaritma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
    }

    private static void faktorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        long hasil = 1;

        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
    }
}
