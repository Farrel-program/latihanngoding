public class latihanTransaksi {
    public static void main(String[] args) {
        // Jumlah hari yang akan dihitung
        int jumlahHari = 3;
        
        // Jumlah transaksi setiap hari
        int transaksiPerHari = 3;
        
        // Nilai setiap transaksi (Rp 50.000)
        int nilaiTransaksi = 50000;
        
        // Total pendapatan semua hari
        int totalPendapatan = 0;
        
        // Loop hari ke-1 sampai hari ke-3
        for (int hari = 1; hari <= jumlahHari; hari++) {
            System.out.println("hari ke-" + hari + ":");
            
            // Loop setiap transaksi di dalam setiap hari
            for (int transaksi = 1; transaksi <= transaksiPerHari; transaksi++) {
                System.out.println("- transaksi " + transaksi + " : " + nilaiTransaksi);
                totalPendapatan += nilaiTransaksi;
            }
            
            System.out.println();
        }
        
        // Cetak total pendapatan setelah semua transaksi selesai
        System.out.println("total : " + totalPendapatan);
    }
}

