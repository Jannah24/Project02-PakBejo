/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo2;

/**
 *
 * @author HP
 */
public class ProjectPakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PAK BEJO NON VOID");
        NonVoid kA = new NonVoid ();
        kA.luas = 1000000;
        kA.panjang = 30;
        kA.lebar = 30;
        kA.isi = 10;
        kA.harga = 54000;
        System.out.println("~Keramik A");
        System.out.println("Total keramik yang dibutuhkan: " + kA.totalKeramik() + " buah");
        System.out.println("Jumlah keseluruhan box: " + kA.jumlahBox() + " box");
        System.out.println("Keseluruhan harga: " + kA.hargaTotal() + " rupiah");
        
        NonVoid kB = new NonVoid();
        kB.luas = 1000000;
        kB.panjang = 40;
        kB.lebar = 40;
        kB.isi = 5;
        kB.harga = 65000;
        System.out.println("~Keramik B");
        System.out.println("Total keramik yang dibutuhkan: " + kB.totalKeramik() + " buah");
        System.out.println("Jumlah keseluruhan box: " + kB.jumlahBox() + " box");
        System.out.println("Keseluruhan harga: " + kB.hargaTotal() + " rupiah");
        
        NonVoid kC = new NonVoid();
        kC.luas = 1000000;
        kC.panjang = 30;
        kC.lebar = 40;
        kC.isi = 8;
        kC.harga = 60000;
        System.out.println("~Keramik C");
        System.out.println("Total keramik yang dibutuhkan: " + kC.totalKeramik() + " buah");
        System.out.println("Jumlah keseluruhan box: " + kC.jumlahBox() + " box");
        System.out.println("Keseluruhan harga: " + kC.hargaTotal() + " rupiah");
        
        System.out.println("PAK BEJO CONSTRUCTOR");
        System.out.println("~Keramik A");
        KeramikConstructor k1 = new KeramikConstructor(30, 30, 10, 1000000, 54000);
        k1.totalKeramik();
        k1.jumlahBox();
        k1.hargaTotal();
        
        System.out.println("~Keramik B");
        KeramikConstructor k2 = new KeramikConstructor(40, 40, 5, 1000000, 65000);
        k2.totalKeramik();
        k2.jumlahBox();
        k2.hargaTotal();
        
        System.out.println("~Keramik C");
        KeramikConstructor k3 = new KeramikConstructor(30, 40, 8, 1000000, 60000);
        k3.totalKeramik();
        k3.jumlahBox();
        k3.hargaTotal();
    }
}
