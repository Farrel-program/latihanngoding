import java.util.Scanner;

public class latihanloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka bintang yang diinginkan: ");
        int n = scanner.nextInt();

        System.out.println("\nPilih soal:");
        System.out.println("Soal 1 - Kotak bintang");
        System.out.println("Soal 2 - Segitiga naik");
        System.out.println("Soal 3 - Segitiga turun");
        System.out.println("Soal 4 - Segitiga turun");

        int pilihan = -1;
        while (pilihan < 1 || pilihan > 4) {
            System.out.print("Masukkan pilihan (1-4): ");
            pilihan = scanner.nextInt();
            
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid! Harus 1 sampai 4.");
            }
        }

        System.out.println();
        switch (pilihan) {
            case 1:
                printSquare(n);
                break;
            case 2:
                printTriangleAscending(n);
                break;
            case 3:
                printTriangleDescending(n);
                break;
            case 4:
                printTriangleDescendingWithSpaces(n);
                break;
        }

        scanner.close();
    }

    private static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleAscending(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleDescending(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleDescendingWithSpaces(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

