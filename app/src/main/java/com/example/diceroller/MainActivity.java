package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRoll;
    TextView tvRollNumber;
    ImageView ivDice, ivDiceTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRoll = findViewById(R.id.btnRoll);
        tvRollNumber = findViewById(R.id.tvRollNumber);
        ivDice = findViewById(R.id.ivDice);
        ivDiceTwo = findViewById(R.id.ivDiceTwo);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                Random r2 = new Random();

                int theRoll;
                int theRoll2;
                // Random number between 1 and 6
                theRoll = r.nextInt(6) + 1;
                theRoll2 = r2.nextInt(6) + 1;

                tvRollNumber.setText("You rolled a " + theRoll + " and a " + theRoll2);

                switch (theRoll){
                    case 1: theRoll = 1;
                    ivDice.setImageResource(R.drawable.dice1);
                    break;

                    case 2: theRoll = 2;
                        ivDice.setImageResource(R.drawable.dice2);
                        break;

                    case 3: theRoll = 3;
                        ivDice.setImageResource(R.drawable.dice3);
                        break;

                    case 4: theRoll = 4;
                        ivDice.setImageResource(R.drawable.dice4);
                        break;

                    case 5: theRoll = 5;
                        ivDice.setImageResource(R.drawable.dice5);
                        break;

                    case 6: theRoll = 6;
                        ivDice.setImageResource(R.drawable.dice6);
                        break;
                }

                switch (theRoll2){
                    case 1: theRoll2 = 1;
                        ivDiceTwo.setImageResource(R.drawable.dice1);
                        break;

                    case 2: theRoll2 = 2;
                        ivDiceTwo.setImageResource(R.drawable.dice2);
                        break;

                    case 3: theRoll2 = 3;
                        ivDiceTwo.setImageResource(R.drawable.dice3);
                        break;

                    case 4: theRoll2 = 4;
                        ivDiceTwo.setImageResource(R.drawable.dice4);
                        break;

                    case 5: theRoll2 = 5;
                        ivDiceTwo.setImageResource(R.drawable.dice5);
                        break;

                    case 6: theRoll2 = 6;
                        ivDiceTwo.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
    }
}