import java.util.Scanner;

public class latihanPerulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Berapa barang yang ingin dibeli? (1-5): ");
        int n = scanner.nextInt();
        scanner.nextLine();
        if(n < 1 || n > 5) {
            System.out.println("Jumlah harus 1-5!");
        
        }
        
        String[] nama = new String[n];
        double[] harga = new double[n];
        int[] jumlah = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("\nBarang ke-" + (i+1));
            System.out.print("Nama: ");
            nama[i] = scanner.nextLine();
            System.out.print("Harga (Rp): ");
            harga[i] = scanner.nextDouble();
            System.out.print("Jumlah: ");
            jumlah[i] = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.println("\nData Penjualan:");
        System.out.printf("%-15s %-10s %-10s %-15s\n", "Nama", "Harga", "Jumlah", "Subtotal");
        System.out.println("---------------------------------------------");
        
        double total = 0;
        for(int i = 0; i < n; i++) {
            double subtotal = harga[i] * jumlah[i];
            total += subtotal;
            System.out.printf("%-15s %-10.0f %-10d %-15.0f\n", nama[i], harga[i], jumlah[i], subtotal);
        }
        
        System.out.println("---------------------------------------------");
        System.out.printf("TOTAL: Rp %.0f\n", total);
        
        scanner.close();
    }
}  
