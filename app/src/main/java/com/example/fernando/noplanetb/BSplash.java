package com.example.fernando.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {
    TextView Title,Subtitle;
    ImageView Image;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        getSupportActionBar().hide();
        Title=(TextView)findViewById(R.id.titulo);
        Subtitle=(TextView)findViewById(R.id.slogan);
        Image=(ImageView)findViewById(R.id.cohete);

        animation = AnimationUtils.loadAnimation(this, R.anim.fadein);

        Title.startAnimation(animation);
        Image.startAnimation(animation);
        Subtitle.startAnimation(animation);
        openApp(true);
    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
