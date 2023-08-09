/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasirmakanan;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM 45
 */
public class KasirMakanan {
    
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1.Soto Ayam 15000");
        int soto;
        soto=15000;
        
        int jumlahbeli,Total,Bayar,Kembali;
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Beli: ");
        jumlahbeli = input.nextInt();
        Total=jumlahbeli*soto;
        System.out.println("Total Pembelian: "+Total);
        System.out.println("Masukan Pembayaran:");
        Bayar=input.nextInt();
        Kembali=Bayar-Total;
        System.out.println("Jumlah Kembalian: "+Kembali);
        
        
    }
    
}
