import java.util.Scanner;
public class Tugas19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String tipeBuku;
        double diskon = 0, hargaBayar = 0, jmlDiskon, hBuku = 2000;
        int bnykBuku;

        System.out.println("Buku apa yang ingin anda beli (Kamus / Novel / Lainnya)" );
        tipeBuku = sc.nextLine();
        System.out.println("Masukkan Jumlah buku yang ingin di beli ");
        bnykBuku = sc.nextInt();

        if(tipeBuku.equalsIgnoreCase("Kamus")) {
            if (bnykBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        }

        if(tipeBuku.equalsIgnoreCase("Novel")) {
            if (bnykBuku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        }

        if(tipeBuku.equalsIgnoreCase("Lainnya")) {
            if (bnykBuku > 3){
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        jmlDiskon = diskon * bnykBuku * hBuku;
        hargaBayar = hBuku - jmlDiskon;

        System.out.println( " Banyak diskon yang ada dapat adalah : " + jmlDiskon);
        System.out.println(" Harga yang harus anda bayar adalah = " + hargaBayar);
    }
}
