package com.rajvaibhav.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by rajesh on 21/9/15.
 */
public class ColorWheel {
    //Member variable
    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7b669e",
            "#53bbb4",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
            "#39add1",
            "#3079ab",
            "#c25975"
    };

    public int getColor() {

        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
