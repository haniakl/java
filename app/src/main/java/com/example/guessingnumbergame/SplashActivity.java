package com.example.guessingnumbergame;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    private ImageView imageView1;
    private TextView textView1;
    Animation animationImage, animationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);


        imageView1=findViewById(R.id.imageView1);
        textView1=findViewById(R.id.textView1);


        animationImage= AnimationUtils.loadAnimation(this,R.anim.image_animation);
        animationText=AnimationUtils.loadAnimation(this,R.anim.text_animation);

        imageView1.setAnimation(animationImage);
        textView1.setAnimation(animationText);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        }.start();
    }

}
