package vian.mobile.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LetterSignsActivity extends AppCompatActivity {

    ImageButton previous, next;
    TextView letter;
    ImageView sign;
    Button learn;
    int nextc = 0;

    int images[] = {
            R.drawable.leta, R.drawable.letaa, R.drawable.letae, R.drawable.letaee, R.drawable.leti, R.drawable.letii,
            R.drawable.letu, R.drawable.letuu, R.drawable.lete, R.drawable.letee, R.drawable.leto, R.drawable.letoo,
            R.drawable.letk, R.drawable.letg, R.drawable.lett, R.drawable.let_d, R.drawable.letth,
            R.drawable.letd};

    String letters[] ={"අ", "ආ", "ඇ", "ඈ", "ඉ", "ඊ", "උ", "ඌ", "එ", "ඒ", "ඔ", "ඕ", "ක", "ග", "ට", "ඩ", "ත", "ද"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_signs);

        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        letter = findViewById(R.id.letter);
        sign = findViewById(R.id.sign);
        learn = findViewById(R.id.learn);

        letter.setText(SSLAlphabet.letter);
        sign.setImageResource(SSLAlphabet.image);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nextc < 18) {
                    previous.setVisibility(View.VISIBLE);
                    String l = letters[nextc];
                    letter.setText(l);
                    sign.setImageResource(images[nextc]);
                    nextc++;
                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nextc == 18){
                    nextc = 17;
                }
                if (nextc > 0) {
                    previous.setVisibility(View.VISIBLE);
                    String l = letters[nextc];
                    letter.setText(l);
                    sign.setImageResource(images[nextc]);
                    nextc--;
                }
            }
        });

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(getApplicationContext(), SSLAlphabet.class));
            }
        });

    }
}