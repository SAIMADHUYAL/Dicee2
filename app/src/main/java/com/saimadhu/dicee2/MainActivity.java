package com.saimadhu.dicee2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceeArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,

        };

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDiceImage;
        final ImageView rightDiceImage;
        leftDiceImage = (ImageView)findViewById(R.id.image_left_dice);
        rightDiceImage = (ImageView)findViewById(R.id.image_right_dice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("DiceeApp","The button has been clicked");

                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(6);
                //Log.d("DiceeNumber","The random Number is: "+randomNumber);

                leftDiceImage.setImageResource(diceeArray[randomNumber]);

                randomNumber = randomNumberGenerator.nextInt(6);

                rightDiceImage.setImageResource(diceeArray[randomNumber]);
            }
        });
    }
}
