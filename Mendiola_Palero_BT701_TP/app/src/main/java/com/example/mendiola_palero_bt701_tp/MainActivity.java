package com.example.mendiola_palero_bt701_tp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.*;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity
{
    ImageButton resetButton;

    ImageView img11, img12, img13,
              img21, img22, img23,
              img31, img32, img33,
              img41, img42, img43;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106,
                            201, 202, 203, 204, 205, 206};

    int img101, img102, img103,
        img104, img105, img106,
        img201, img202, img203,
        img204, img205, img206;

    int card1, card2;
    int click1, click2;
    int cardNum = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = (ImageButton) findViewById(R.id.resetButton);

        img11 = (ImageView) findViewById(R.id.aespaCard1);
        img12 = (ImageView) findViewById(R.id.aespaCard2);
        img13 = (ImageView) findViewById(R.id.aespaCard3);
        img21 = (ImageView) findViewById(R.id.aespaCard4);
        img22 = (ImageView) findViewById(R.id.aespaCard5);
        img23 = (ImageView) findViewById(R.id.aespaCard6);
        img31 = (ImageView) findViewById(R.id.aespaCard7);
        img32 = (ImageView) findViewById(R.id.aespaCard8);
        img33 = (ImageView) findViewById(R.id.aespaCard9);
        img41 = (ImageView) findViewById(R.id.aespaCard10);
        img42 = (ImageView) findViewById(R.id.aespaCard11);
        img43 = (ImageView) findViewById(R.id.aespaCard12);

        img11.setTag("0");
        img12.setTag("1");
        img13.setTag("2");
        img21.setTag("3");
        img22.setTag("4");
        img23.setTag("5");
        img31.setTag("6");
        img32.setTag("7");
        img33.setTag("8");
        img41.setTag("9");
        img42.setTag("10");
        img43.setTag("11");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img11, card);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img12, card);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img13, card);
            }
        });

        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img21, card);
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img22, card);
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img23, card);
            }
        });

        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img31, card);
            }
        });

        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img32, card);
            }
        });

        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img33, card);
            }
        });

        img41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img41, card);
            }
        });

        img42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img42, card);
            }
        });

        img43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                doStuff(img43, card);
            }
        });
    }

    private void doStuff(ImageView iv, int card)
    {
        if(cardsArray[card] == 101)
        {
            iv.setImageResource(img101);
        }
        else if(cardsArray[card] == 102)
        {
            iv.setImageResource(img102);
        }
        else if(cardsArray[card] == 103)
        {
            iv.setImageResource(img103);
        }
        else if(cardsArray[card] == 104)
        {
            iv.setImageResource(img104);
        }
        else if(cardsArray[card] == 105)
        {
            iv.setImageResource(img105);
        }
        else if(cardsArray[card] == 106)
        {
            iv.setImageResource(img106);
        }
        else if(cardsArray[card] == 201)
        {
            iv.setImageResource(img201);
        }
        else if(cardsArray[card] == 202)
        {
            iv.setImageResource(img202);
        }
        else if(cardsArray[card] == 203)
        {
            iv.setImageResource(img203);
        }
        else if(cardsArray[card] == 204)
        {
            iv.setImageResource(img204);
        }
        else if(cardsArray[card] == 205)
        {
            iv.setImageResource(img205);
        }
        else if(cardsArray[card] == 206)
        {
            iv.setImageResource(img206);
        }

        if (cardNum == 1)
        {
            card1 = cardsArray[card];
            if(card1 > 200)
            {
                card1 = card1 - 100;
            }
            cardNum = 2;
            click1 = card;

            iv.setEnabled(false);
        }
        else if (cardNum == 2)
        {
            card2 = cardsArray[card];
            if(card2 > 200)
            {
                card2 = card2 - 100;
            }
            cardNum = 1;
            click2 = card;

            img11.setEnabled(false);
            img12.setEnabled(false);
            img13.setEnabled(false);
            img21.setEnabled(false);
            img22.setEnabled(false);
            img23.setEnabled(false);
            img31.setEnabled(false);
            img32.setEnabled(false);
            img33.setEnabled(false);
            img41.setEnabled(false);
            img42.setEnabled(false);
            img43.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate()
    {
        if(card1 == card2)
        {
            if (click1 == 0)
            {
                img11.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 1)
            {
                img12.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 2)
            {
                img13.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 3)
            {
                img21.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 4)
            {
                img22.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 5)
            {
                img23.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 6)
            {
                img31.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 7)
            {
                img32.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 8)
            {
                img33.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 9)
            {
                img41.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 10)
            {
                img42.setVisibility(View.INVISIBLE);
            }
            else if (click1 == 11)
            {
                img43.setVisibility(View.INVISIBLE);
            }




            if (click2 == 0)
            {
                img11.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 1)
            {
                img12.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 2)
            {
                img13.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 3)
            {
                img21.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 4)
            {
                img22.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 5)
            {
                img23.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 6)
            {
                img31.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 7)
            {
                img32.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 8)
            {
                img33.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 9)
            {
                img41.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 10)
            {
                img42.setVisibility(View.INVISIBLE);
            }
            else if (click2 == 11)
            {
                img43.setVisibility(View.INVISIBLE);
            }
        }
        else
        {
            img11.setImageResource(R.drawable.aespa_logo);
            img12.setImageResource(R.drawable.aespa_logo);
            img13.setImageResource(R.drawable.aespa_logo);
            img21.setImageResource(R.drawable.aespa_logo);
            img22.setImageResource(R.drawable.aespa_logo);
            img23.setImageResource(R.drawable.aespa_logo);
            img31.setImageResource(R.drawable.aespa_logo);
            img32.setImageResource(R.drawable.aespa_logo);
            img33.setImageResource(R.drawable.aespa_logo);
            img41.setImageResource(R.drawable.aespa_logo);
            img42.setImageResource(R.drawable.aespa_logo);
            img43.setImageResource(R.drawable.aespa_logo);
        }

        img11.setEnabled(true);
        img12.setEnabled(true);
        img13.setEnabled(true);
        img21.setEnabled(true);
        img22.setEnabled(true);
        img23.setEnabled(true);
        img31.setEnabled(true);
        img32.setEnabled(true);
        img33.setEnabled(true);
        img41.setEnabled(true);
        img42.setEnabled(true);
        img43.setEnabled(true);

        checkEnd();
    }

    private void checkEnd()
    {
        if(img11.getVisibility() == View.INVISIBLE &&
                img12.getVisibility() == View.INVISIBLE &&
                img13.getVisibility() == View.INVISIBLE &&
                img21.getVisibility() == View.INVISIBLE &&
                img22.getVisibility() == View.INVISIBLE &&
                img23.getVisibility() == View.INVISIBLE &&
                img31.getVisibility() == View.INVISIBLE &&
                img32.getVisibility() == View.INVISIBLE &&
                img33.getVisibility() == View.INVISIBLE &&
                img41.getVisibility() == View.INVISIBLE &&
                img42.getVisibility() == View.INVISIBLE &&
                img43.getVisibility() == View.INVISIBLE)
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("Game Finished! Well Done, MY! Want to play again?")
                    .setCancelable(false)
                    .setPositiveButton("Retry", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            reset();
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources()
    {
        img101 = R.drawable.black_mamba;
        img102 = R.drawable.rocket_puncher;
        img103 = R.drawable.xenoglossy;
        img104 = R.drawable.naevis;
        img105 = R.drawable.armamenter;
        img106 = R.drawable.ed_hacker;
        img201 = R.drawable.black_mamba1;
        img202 = R.drawable.rocket_puncher1;
        img203 = R.drawable.xenoglossy1;
        img204 = R.drawable.naevis1;
        img205 = R.drawable.armamenter1;
        img206 = R.drawable.ed_hacker1;

    }

    public void reset()
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}