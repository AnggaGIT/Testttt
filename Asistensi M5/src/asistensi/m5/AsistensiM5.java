/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi.m5;

/**
 *
 * @author LEGION I5
 */
public class AsistensiM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anjing a = new Anjing(true);
        hewan b = new hewan(1,"test",true);
        Kucing c =new Kucing();
        System.out.println("Anjing makan "+a.getJenisMakanan());
        System.out.println("Hewan makan "+b.getJenisMakanan());
        System.out.println("Kucing makan "+c.getJenisMakanan());
    }
    
}
