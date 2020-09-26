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
public class NonVoid {
    /* membuat atribut */
    int panjang;
    int lebar;
    int isi;
    int luas;
    int harga;
    
    /* membuat methods */
    int totalKeramik(){
        int keramik;
        keramik = this.luas / (this.panjang*this.lebar);
        return keramik;
    }
    
    int jumlahBox(){
        int box;
        box = (this.luas/(this.panjang*this.lebar))/this.isi;
        return box;
    }
    
    int hargaTotal(){
        int total;
        total = ((this.luas/(this.panjang*this.lebar))/this.isi)*harga;
        return total;
    }
}
