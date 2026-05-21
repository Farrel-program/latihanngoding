import java.util.Scanner;

public class method {
    public static int kali(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int hitung(int a, int b) {
        return a + b;
    }

    public static int hitung(double a, double b) {
        return (int)(a * b);
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("panjang : ");
        int panjang = input.nextInt();
        System.out.print("lebar : ");
        int lebar = input.nextInt();
        
        int hasil = kali(panjang, lebar);
        System.out.println("Hasil perkalian: " + hasil);
        System.out.print("Masukkan angka untuk faktorial: ");
        int angka = input.nextInt();
        int hasilFactorial = factorial(angka);
        System.out.println("Hasil faktorial: " + hasilFactorial);
        System.out.print("Masukkan angka pertama untuk penjumlahan: ");
        int num1 = input.nextInt();
        System.out.print("Masukkan angka kedua untuk penjumlahan: ");
        int num2 = input.nextInt();
        int hasilHitung = hitung(num1, num2);
        System.out.println("Hasil penjumlahan: " + hasilHitung);
        System.out.print("Masukkan angka pertama untuk perkalian: ");
        double num3 = input.nextDouble();
        System.out.print("Masukkan angka kedua untuk perkalian: ");
        double num4 = input.nextDouble();
        int hasilHitung2 = hitung(num3, num4);
        System.out.println("Hasil perkalian: " + hasilHitung2);
        input.close();
}
}