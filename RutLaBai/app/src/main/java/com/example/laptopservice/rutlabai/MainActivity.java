package com.example.laptopservice.rutlabai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mh;
    ImageView imgLaBai;
    Button btnRutLaBai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mh=(RelativeLayout)findViewById(R.id.manhinh);
        mh.setBackgroundResource(R.drawable.images);
        imgLaBai=(ImageView)findViewById(R.id.Labai);
        btnRutLaBai=(Button)findViewById(R.id.buttonRutLaBai);
        btnRutLaBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> mangLaBai = new ArrayList<Integer>();
                mangLaBai.add(R.drawable.c1);
                mangLaBai.add(R.drawable.c2);
                mangLaBai.add(R.drawable.c3);
                mangLaBai.add(R.drawable.c4);
                mangLaBai.add(R.drawable.c5);
                mangLaBai.add(R.drawable.c6);
                mangLaBai.add(R.drawable.c7);
                mangLaBai.add(R.drawable.c8);
                mangLaBai.add(R.drawable.c9);
                mangLaBai.add(R.drawable.c10);
                mangLaBai.add(R.drawable.d1);
                mangLaBai.add(R.drawable.d2);
                mangLaBai.add(R.drawable.d3);
                mangLaBai.add(R.drawable.d4);
                mangLaBai.add(R.drawable.d5);
                mangLaBai.add(R.drawable.d6);
                Random r=new Random();
                int batki=r.nextInt(mangLaBai.size());
                imgLaBai.setImageResource(mangLaBai.get(batki));
            }
        });
    }
}
