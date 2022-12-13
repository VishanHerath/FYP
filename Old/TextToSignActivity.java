package vian.mobile.fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.Dictionary;
import java.util.Hashtable;

import static android.widget.LinearLayout.*;

public class TextToSignActivity extends AppCompatActivity {

    ImageView let1, let2, let3, let4;
    Button transBtn;
    EditText inTxt;
    String input;
    Dictionary dictionary;
    LinearLayout linLay;
    boolean dictCheck;

    int images[] = {
            R.drawable.leta, R.drawable.letaa, R.drawable.letae, R.drawable.letaee, R.drawable.leti, R.drawable.letii,
            R.drawable.letu, R.drawable.letuu, R.drawable.lete, R.drawable.letee, R.drawable.leto, R.drawable.letoo,
            R.drawable.letk, R.drawable.letg, R.drawable.letj, R.drawable.lett, R.drawable.letd, R.drawable.letth,
            R.drawable.let_d, R.drawable.letp, R.drawable.letb, R.drawable.letr, R.drawable.lety, R.drawable.letm,
            R.drawable.letl, R.drawable.letw, R.drawable.lets, R.drawable.letn
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_sign);

        dictionary = new Hashtable();
        let1 = findViewById(R.id.let1);
        let2 = findViewById(R.id.let2);
        let3 = findViewById(R.id.let3);
        let4 = findViewById(R.id.let4);
        transBtn = findViewById(R.id.transBtn);
        inTxt = findViewById(R.id.inputTxt);
        linLay = findViewById(R.id.outputLayout);

        if(!dictCheck)
            dictInt();

        transBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inTxt.getText().toString();
                //transMeth(input);
                //transUsingDict(input);
                autoImg(input);
            }
        });
    }

    public void transMeth(String in) {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                let1.setImageResource(images[(int) dictionary.get(in.charAt(i))]);
            }
            if (i == 1) {
                let2.setImageResource(images[(int) dictionary.get(in.charAt(i))]);
            }
            if (i == 2) {
                let3.setImageResource(images[(int) dictionary.get(in.charAt(i))]);
            }
            if (i == 3) {
                let4.setImageResource(images[(int) dictionary.get(in.charAt(i))]);
            }
        }
    }

    public void autoImg(String in) {
        int x = in.length();
        for(int i=0; i<x; i++){
            ImageView imView = new ImageView(this);
            imView.setImageResource(images[(int) dictionary.get(in.charAt(i))]);
            linLay.addView(imView);
        }
        //setContentView(linLay);
    }

    public void dictInt(){
        dictionary.put('අ', 0);
        dictionary.put('ආ', 1);
        dictionary.put('ඇ', 2);
        dictionary.put('ඈ', 3);
        dictionary.put('ඉ', 4);
        dictionary.put('ඊ', 5);
        dictionary.put('උ', 6);
        dictionary.put('ඌ', 7);
        dictionary.put('එ', 8);
        dictionary.put('ඒ', 9);
        dictionary.put('ඔ', 10);
        dictionary.put('ඕ', 11);
        dictionary.put('ක', 12);
        dictionary.put('ග', 13);
        dictionary.put('ජ', 14);
        dictionary.put('ට', 15);
        dictionary.put('ද', 16);
        dictionary.put('ත', 17);
        dictionary.put('ඩ', 18);
        dictionary.put('ප', 19);
        dictionary.put('බ', 20);
        dictionary.put('ර', 21);
        dictionary.put('ය', 22);
        dictionary.put('ම', 23);
        dictionary.put('ල', 24);
        dictionary.put('ව', 25);
        dictionary.put('ස', 26);
        dictionary.put('න', 27);
        //int test = Integer.parseInt(R.drawable.lettera);
    }
}