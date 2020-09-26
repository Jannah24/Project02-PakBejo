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
public class KeramikConstructor {
     /* membuat atribut */
    int panjang;
    int lebar;
    int isi;
    int luas;
    int harga;
    
    //constructor
    KeramikConstructor(int p, int l, int i, int L, int h){
        this.panjang = p;
        this.lebar = l;
        this.isi = i;
        this.luas = L;
        this.harga = h;

    }
    
    /* membuat metode */
    void totalKeramik(){
        int keramik = this.luas/(this.panjang*this.lebar);
        System.out.println("Total keramik yang dibutuhkan: " + keramik + " buah");
    }
    void jumlahBox(){
        int box = (this.luas/(this.panjang*this.lebar))/this.isi;
        System.out.println("Jumlah keseluruhan box: " + box + " box");
    }
    void hargaTotal(){
        int keseluruhan = ((this.luas/(this.panjang*this.lebar))/this.isi)*this.harga;
        System.out.println("Keseluruhan harga: " + keseluruhan + " rupiah"); 
    }
            
}
