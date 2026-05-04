import java.util.Scanner;

public class Quizoperasional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //meminta input jumlah jenis pengeluaran operasional
        System.out.print("masukan jumlah jenis pengeluaran operasional: ");
        int jumlahjenispengeluaran = input.nextInt();

        //Instalasi total poengeluaran operasional
        double totalPengeluaran = 0;

        //loop untuk setiap jenis pengeluaran operasional
        for (int i = 1; i <= jumlahjenispengeluaran; i++) {
            System.out.print("masukan nominal biaya pengeluaran operasional ke- " + i + ": Rp ");
            Double biaya = input.nextDouble();
            totalPengeluaran += biaya;

        }

          //menampilkan total pengeluaran operasional setelah setiap input
            System.out.println("\n=== Total pengeluaran operasional saat ini ===");
            System.out.println("Total penegeluaran opersional: Rp " + totalPengeluaran);

            input.close();
    }
}