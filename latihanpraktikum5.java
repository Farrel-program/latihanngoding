import java.util.Scanner;

public class latihanpraktikum5 {

  
    public static void main(String[] args) {
        // Scanner untuk input user
        Scanner scanner = new Scanner(System.in);

        // Input ukuran array
        System.out.print("Masukkan ukuran array: ");
        int ukuran = scanner.nextInt();

        // Input elemen array
        int[] array = new int[ukuran];
        System.out.println("Masukkan " + ukuran + " elemen array:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Menu pilihan tugas
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nPilih tugas:");
            System.out.println("1. Cari Nilai Tertinggi");
            System.out.println("2. Pencarian Angka");
            System.out.println("3. Membalik Array");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cariNilaiTertinggi(array);
                    break;
                case 2:
                    System.out.print("Masukkan angka yang ingin dicari: ");
                    int angkaDicari = scanner.nextInt();
                    pencarianAngka(array, angkaDicari);
                    break;
                case 3:
                    membalikArray(array);
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }

    // Tugas 1: Cari Nilai Tertinggi
    public static void cariNilaiTertinggi(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array kosong");
            return;
        }

        int max = arr[0]; // Asumsikan elemen pertama adalah yang terbesar
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max jika ada yang lebih besar
            }
        }
        System.out.println("Nilai tertinggi dalam array: " + max);
    }

    // Tugas 2: Pencarian (Searching)
    public static void pencarianAngka(int[] arr, int target) {
        boolean ditemukan = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ditemukan = true;
                break; // Keluar dari loop jika sudah ditemukan
            }
        }
        if (ditemukan) {
            System.out.println("Angka " + target + " ditemukan dalam array");
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array");
        }
    }

    // Tugas 3: Membalik Array
    public static void membalikArray(int[] arr) {
        System.out.print("Array dari belakang: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
