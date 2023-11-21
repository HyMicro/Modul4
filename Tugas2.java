import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data
        int[] data = { 38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5 };

        // Mengurutkan data
        Arrays.sort(data);

        // Menampilkan data yang sudah diurutkan
        System.out.println("Data setelah diurutkan: " + Arrays.toString(data));

        // Mencari indeks elemen menggunakan inputan dari user
        System.out.print("Masukkan elemen yang ingin dicari: ");
        int targetElement = scanner.nextInt();
        int index = Arrays.binarySearch(data, targetElement);

        if (index >= 0) {
            System.out.println("Elemen " + targetElement + " ditemukan di indeks " + index);
        } else {
            System.out.println("Elemen " + targetElement + " tidak ditemukan dalam data.");
        }

        // Menghitung rasio elemen positif, negatif, dan nol
        double positiveRatio = calculateRatio(data, "positive");
        double negativeRatio = calculateRatio(data, "negative");
        double zeroRatio = calculateRatio(data, "zero");

        // Menampilkan hasil rasio
        System.out.println("Rasio elemen positif: " + positiveRatio);
        System.out.println("Rasio elemen negatif: " + negativeRatio);
        System.out.println("Rasio elemen nol: " + zeroRatio);

        scanner.close();
    }

    // Method untuk menghitung rasio elemen berdasarkan jenis (positive, negative,
    // zero)
    private static double calculateRatio(int[] data, String type) {
        int count = 0;
        int totalElements = data.length;

        for (int element : data) {
            if ((type.equals("positive") && element > 0) ||
                    (type.equals("negative") && element < 0) ||
                    (type.equals("zero") && element == 0)) {
                count++;
            }
        }

        return (double) count / totalElements;
    }
}
