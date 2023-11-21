import java.util.Random;
import java.util.Scanner;

public class Tugas1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            displayMenu();
            System.out.print("Pilih opsi (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    randomAngka();
                    break;
                case 2:
                    randomString();
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Random Angka");
        System.out.println("2. Random String");
        System.out.println("3. Keluar");
    }

    private static void randomAngka() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas bawah angka acak: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Masukkan batas atas angka acak: ");
        int upperBound = scanner.nextInt();

        int randomInt = generateRandomNumber(lowerBound, upperBound);
        System.out.println("Angka acak: " + randomInt);
        scanner.close();
    }

    private static void randomString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang string acak: ");
        int stringLength = scanner.nextInt();

        String randomString = generateRandomString(stringLength);
        System.out.println("String acak: " + randomString);
        scanner.close();
    }

    private static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}
