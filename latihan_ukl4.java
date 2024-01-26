package seleksi_kondisi;

import java.util.Scanner;

public class latihan_ukl4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Ali", "Budi", "Dani", "Edi", "Umar"};
        String[] cot = {"", "Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondong", "Barrack"};
        int[] wday = {0, 915000, 915000, 575000, 575000, 595000, 595000, 495000, 495000, 495000, 25000};
        int[] wend = {0, 1025000, 1025000, 695000, 695000, 715000, 715000, 575000, 575000, 575000, 25000};
        int[] holi = {0, 1225000, 1225000, 895000, 895000, 915000, 915000, 755000, 755000, 755000, 35000};
        int tipe = 0;
        int gol = 0;
        int lama = 0;

        System.out.println("==================================");
        System.out.println("     BHAKTI ALAM Cottage Rate     ");
        System.out.println("==================================");
        System.out.print("Masukkan ID Anda: ");
        int id = input.nextInt();
        System.out.println("==================================");

        if (id < 1 || id > 5) {
            System.out.println("SALAHSETAN");
            System.out.println("==================================");
        } else {
            System.out.println("Tipe Cottage: ");
            for (int i = 1; i < cot.length; i++) {
                System.out.println(i + ". " + cot[i]);
            }
            System.out.print("Tipe Cottage Anda: ");
            tipe = input.nextInt();
            if (tipe < 1 || tipe >= cot.length) {
                System.out.println("SALAHSETAN");
            }
            System.out.println("==================================");
        }

        System.out.println("Golongan Hari");
        System.out.println("1. Weekday");
        System.out.println("2. Weekend");
        System.out.println("3. Holiday");
        System.out.print("Golongan Hari Anda: ");
        gol = input.nextInt();
        System.out.println("==================================");
        if (gol < 1 || gol > 3) {
            System.out.println("SALAHSETAN");
            System.out.println("==================================");
        } else {
            System.out.print("Lama Menginap (hari): ");
            lama = input.nextInt();
            int biaya = hitung(tipe, gol, lama, wday, wend, holi, cot);
            System.out.println("==================================");
            System.out.println("ID Pelanggan: " + id);
            System.out.println("Nama Pelanggan: " + nama[id]);
            System.out.println("Jumlah Hari: " + lama);
            System.out.println("Tipe Cottage: " + cot[tipe]);
            System.out.println("Jumlah biaya: " + biaya);
            System.out.println("==================================");
        }
    }

    public static int hitung(int tipe, int gol, int lama, int wday[], int wend[], int holi[], String cot[]) {
        int biaya = 0;
        if (tipe < 1 || tipe >= cot.length || gol < 1 || gol > 3) {
            System.out.println("SALAHSETAN");
        } else {
            if (gol == 1) {
                biaya = wday[tipe] * lama;
            } else if (gol == 2) {
                biaya = wend[tipe] * lama;
            } else if (gol == 3) {
                biaya = holi[tipe] * lama;
            }
        }
        return biaya;
    }

}
