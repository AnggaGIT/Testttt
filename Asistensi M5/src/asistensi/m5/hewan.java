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
public class hewan {
    int jumlah;
    String suara;
    boolean berekor;

    public hewan(int jumlah, String suara, boolean berekor) {
        this.jumlah = jumlah;
        this.suara = suara;
        this.berekor = berekor;
    }
    
    public String getJenisMakanan(){
        return "Anjing";
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public boolean isBerekor() {
        return berekor;
    }

    public void setBerekor(boolean berekor) {
        this.berekor = berekor;
    }
    
}

class Anjing extends hewan{
    protected boolean berbulu;
    public Anjing(boolean berbulu){
        super(4,"gukguk",true);
        this.berbulu = berbulu;
    }
    
    @Override
    public String getJenisMakanan(){
        return "teman";
    }

    public boolean isBerbulu() {
        return berbulu;
    }
    
}

class Kucing extends hewan{
    public Kucing(){
        super(4,"meong",true);
    }
    @Override
    public String getJenisMakanan(){
        return "kawan";
    }
}