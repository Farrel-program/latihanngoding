import java.util.Scanner;

/**
 * Program Pemesanan Tiket Surabaya Zoo
 * 
 * Program ini adalah aplikasi sederhana untuk memesan tiket Surabaya Zoo.
 * Fitur utama:
 * - Input kategori tiket dan harga (Menu 1)
 * - Input jumlah tiket yang ingin dibeli per kategori (Menu 2)
 * - Lihat total bayar berdasarkan jumlah tiket dan harga (Menu 3)
 * - Reset jumlah beli tiket (Menu 4)
 * - Keluar program (Menu 5)
 * 
 * Catatan: Pastikan input kategori tanpa spasi atau gunakan nextLine untuk spasi.
 */
public class latihanarray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi array dengan ukuran maksimal (akan diubah di menu 1)
        String[] kategori = new String[100];
        int[] harga = new int[100];
        int[] qty = new int[100]; // qty untuk jumlah tiket per kategori
        
        // Variabel kontrol
        int total = 0; // Total bayar
        int jumlahKategori = 0; // Jumlah kategori yang diinput
        int pilihMenu = 0; // Pilihan menu

        // Loop utama menu
        do {
            System.out.println("\n=== Pemesanan Tiket Surabaya Zoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli Tiket");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Reset Jumlah Beli");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu (1-5): ");
            pilihMenu = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah nextInt()

            switch (pilihMenu) {
                case 1:
                    // Input Kategori dan Harga
                    System.out.print("Masukkan jumlah kategori yang ingin diisi (maks 100): ");
                    jumlahKategori = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    
                    if (jumlahKategori <= 0 || jumlahKategori > 100) {
                        System.out.println("Jumlah kategori harus antara 1-100.");
                        break;
                    }
                    
                    // Deklarasi ulang array sesuai jumlah kategori
                    kategori = new String[jumlahKategori];
                    harga = new int[jumlahKategori];
                    qty = new int[jumlahKategori]; // Reset qty juga
                    
                    // Input data kategori dan harga
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.print("Nama kategori ke-" + (i + 1) + ": ");
                        kategori[i] = scanner.nextLine(); // Gunakan nextLine untuk spasi
                        System.out.print("Harga tiket untuk " + kategori[i] + ": ");
                        harga[i] = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi newline
                    }
                    
                    // Tampilkan daftar kategori dan harga
                    System.out.println("\nDaftar Kategori dan Harga:");
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.println((i + 1) + ". " + kategori[i] + " - Rp " + harga[i]);
                    }
                    break;
                    
                case 2:
                    // Input Jumlah Beli Tiket
                    if (jumlahKategori == 0) {
                        System.out.println("Silakan input kategori dan harga terlebih dahulu (Menu 1).");
                    } else {
                        System.out.println("\nPilih kategori untuk membeli tiket:");
                        for (int i = 0; i < jumlahKategori; i++) {
                            System.out.println((i + 1) + ". " + kategori[i] + " - Rp " + harga[i]);
                        }
                        System.out.print("Pilih nomor kategori (1-" + jumlahKategori + "): ");
                        int pilih = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi newline
                        
                        if (pilih >= 1 && pilih <= jumlahKategori) {
                            System.out.print("Jumlah tiket untuk " + kategori[pilih - 1] + ": ");
                            int jumlah = scanner.nextInt();
                            scanner.nextLine(); // Konsumsi newline
                            
                            if (jumlah >= 0) {
                                qty[pilih - 1] = jumlah;
                                System.out.println("Berhasil menambahkan " + qty[pilih - 1] + " tiket untuk kategori " + kategori[pilih - 1]);
                            } else {
                                System.out.println("Jumlah tiket tidak boleh negatif.");
                            }
                        } else {
                            System.out.println("Pilihan kategori tidak valid.");
                        }
                    }
                    break;
                    
                case 3:
                    // Lihat Total Bayar
                    if (jumlahKategori == 0) {
                        System.out.println("Silakan input kategori dan harga terlebih dahulu (Menu 1).");
                    } else {
                        total = 0;
                        System.out.println("\nDaftar Pembelian:");
                        for (int i = 0; i < jumlahKategori; i++) {
                            if (qty[i] > 0) {
                                int subtotal = qty[i] * harga[i];
                                System.out.println(kategori[i] + ": " + qty[i] + " tiket x Rp " + harga[i] + " = Rp " + subtotal);
                                total += subtotal;
                            }
                        }
                        System.out.println("Total Bayar: Rp " + total);
                    }
                    break;
                    
                case 4:
                    // Reset Jumlah Beli
                    if (jumlahKategori == 0) {
                        System.out.println("Tidak ada data untuk direset.");
                    } else {
                        for (int i = 0; i < jumlahKategori; i++) {
                            qty[i] = 0;
                        }
                        System.out.println("Jumlah beli tiket telah direset.");
                    }
                    break;
                    
                case 5:
                    // Keluar Program
                    System.out.println("Terima kasih telah menggunakan layanan pemesanan tiket Surabaya Zoo!");
                    break;
                    
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihMenu != 5);
        
        scanner.close(); // Tutup scanner
    }
}