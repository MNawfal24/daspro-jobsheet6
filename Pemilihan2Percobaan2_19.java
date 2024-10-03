import java.util.Scanner;

public class Pemilihan2Percobaan2_19 {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        int pilihan_menu;
        double diskon, totalHarga = 0;
        String member, caraMembayar;
        double harga, potonganQris = 1000;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan Angka Dari Menu Yang Dipilih = ");
        pilihan_menu = sc19.nextInt();
        sc19.nextLine();
        System.out.print("Apakah Punya Member (y/n) ? = ");
        member = sc19.nextLine();
        System.out.println("pilih pembayaran(Qris / Tunai)");
        caraMembayar = sc19.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            totalHarga = harga - (harga * diskon);
            System.out.println("Total Harga Setelah Diskon = " + totalHarga);

            if (caraMembayar.equalsIgnoreCase("QRIS")) {
                totalHarga -= potonganQris;
                System.out.println(" Harga Akhirnya = " + totalHarga);
            }
            } else if (member.equalsIgnoreCase("n")) {
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Rice Bowl = " + harga);

                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea = " + harga);

                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga  Bundling = " + harga);

                } else {
                    System.out.println("Masukkan Pilihan Menu Dengan Benar ");
                    return;
                }

                System.out.println("Total Harga= " + harga);
                if (caraMembayar.equalsIgnoreCase("QRIS")) {
                    harga -= potonganQris;
                    System.out.println(" Harga Akhirnya = " + harga);
                }

            } else {
                System.out.println("Member Tidak Valid");

                System.out.println("----------------------------------------");

            }
        }
    }
