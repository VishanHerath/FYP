package vian.mobile.fyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SSLAlphabet extends AppCompatActivity {

    CardView letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9, letter10, letter11,
            letter12, letter13, letter14, letter15, letter16, letter17, letter18;

    public static int image;
    public static String letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_s_l_alphabet);

        letter1 = findViewById(R.id.letter1);
        letter2 = findViewById(R.id.letter2);
        letter3 = findViewById(R.id.letter3);
        letter4 = findViewById(R.id.letter4);
        letter5 = findViewById(R.id.letter5);
        letter6 = findViewById(R.id.letter6);
        letter7 = findViewById(R.id.letter7);
        letter8 = findViewById(R.id.letter8);
        letter9 = findViewById(R.id.letter9);
        letter10 = findViewById(R.id.letter10);
        letter11 = findViewById(R.id.letter11);
        letter12 = findViewById(R.id.letter12);
        letter13 = findViewById(R.id.letter13);
        letter14 = findViewById(R.id.letter14);
        letter15 = findViewById(R.id.letter15);
        letter16 = findViewById(R.id.letter16);
        letter17 = findViewById(R.id.letter17);
        letter18 = findViewById(R.id.letter18);

        letter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                image = R.drawable.leta;
                letter = "අ";
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ආ";
                image = R.drawable.letaa;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඇ";
                image = R.drawable.letae;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඈ";
                image = R.drawable.letaee;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඉ";
                image = R.drawable.leti;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඊ";
                image = R.drawable.letii;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "උ";
                image = R.drawable.letu;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඌ";
                image = R.drawable.letuu;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "එ";
                image = R.drawable.lete;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඒ";
                image = R.drawable.letee;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඔ";
                image = R.drawable.leto;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඕ";
                image = R.drawable.letoo;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ක";
                image = R.drawable.letk;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ග";
                image = R.drawable.letg;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ට";
                image = R.drawable.lett;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ඩ";
                image = R.drawable.let_d;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ත";
                image = R.drawable.letth;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });

        letter18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                letter = "ද";
                image = R.drawable.letd;
                startActivity(new Intent(getApplicationContext(), LetterSignsActivity.class));
            }
        });
    }
}