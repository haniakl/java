package com.example.guessingnumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    private Button button1;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

button1=findViewById(R.id.button1);
radio1=findViewById(R.id.radio1);
radio2=findViewById(R.id.radio2);
radio3=findViewById(R.id.radio3);

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,GameActivity.class);

        if (! radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked()){
            Snackbar.make(v,"Please select a number digits",Snackbar.LENGTH_LONG).show();
        }else {
            if (radio1.isChecked()){
               intent.putExtra("one",true);
            }
            if (radio2.isChecked()){
                intent.putExtra("two",true);
            }
            if (radio3.isChecked()){
                intent.putExtra("Three",true);
            }
            startActivity(intent);

            }

        }

});


    }

}