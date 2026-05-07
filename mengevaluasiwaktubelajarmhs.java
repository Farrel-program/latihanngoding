import java.util.Scanner;
public class mengevaluasiwaktubelajarmhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("masukan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        String[] namamahasiswa = new String[100];
        int[] waktuBelajar = new int[100];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namamahasiswa[i] = input.next();
            System.out.print("Masukkan waktu lama belajar " + namamahasiswa[i] + " (dalam jam): ");
            waktuBelajar[i] = input.nextInt();
        }
        System.out.println("\n=== Evaluasi Waktu Belajar Mahasiswa ===");
        System.out.println("Jumlah jam belajar dalam seminggu: " + (jumlahMahasiswa * 7));

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Evaluasi untuk " + namamahasiswa[i] + ":");
            if (waktuBelajar[i] < 2) {
                System.out.println("Waktu belajarmu kurang, masa depanmu ditentukan dari cara belajarmu.");
            } else if (waktuBelajar[i] >= 2 && waktuBelajar[i] <= 4) {
                System.out.println("Waktu belajar cukup, tetap pertahankan.");
            } else {
                System.out.println("Waktu belajar berlebihan, pastikan untuk istirahat yang cukup.");
            }
        }

        input.close();
    }
    
}
