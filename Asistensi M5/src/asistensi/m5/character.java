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
public class character {
    int hp;
    int attack;
    int defense;
    boolean magic;

    public character(int hp, int attack, int defense, boolean magic) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
    }
}
class player extends character{
    public player(){
        super(100,80,60,true);
    }
}
class enemy extends character{
    public enemy(){
        super(2000,150,500,false);
    }
}