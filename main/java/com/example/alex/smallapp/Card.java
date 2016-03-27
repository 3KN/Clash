package com.example.alex.smallapp;

import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Admin on 27.03.2016.
 */
public class Card {

    String name;
    String drawablename;
    int rarity;
    String selecteddrawablename;
    boolean selected;
    static ImageView im;
    int elixircost;

    Card(String name, String drawablename,String selecteddrawablename, int rarity,int elixircost )
    {
        this.name=name;
        this.drawablename=drawablename;
        this.rarity=rarity;
        this.selecteddrawablename =selecteddrawablename;
        this.selected = false;
        this.elixircost = elixircost;
    }

    public static boolean isAnySelected(Card[] cards){

        for (int i = 0; i < cards.length; i++) {
            if(cards[i].selected) return true;
        }

        return false;
    }

    public  boolean isUsed(Card[] mass){

        

        return false;
    }

}
