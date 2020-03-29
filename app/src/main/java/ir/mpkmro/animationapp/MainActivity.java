package ir.mpkmro.animationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ir.mpkmro.animationapp.Interaction.InteractionActivity;
import ir.mpkmro.animationapp.Intro.IntroActivity;
import ir.mpkmro.animationapp.Progress.ProgressActivity;
import ir.mpkmro.animationapp.Sample.SampleActivity;
import ir.mpkmro.animationapp.TypoGraphy.TypoGraphyActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.sample).setOnClickListener(this);
        findViewById(R.id.intro).setOnClickListener(this);
        findViewById(R.id.interactive).setOnClickListener(this);
        findViewById(R.id.progress).setOnClickListener(this);
        findViewById(R.id.font).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {


            case R.id.sample:
                intent = new Intent(MainActivity.this, SampleActivity.class);
                break;
            case R.id.interactive:
                intent = new Intent(MainActivity.this, InteractionActivity.class);
                break;
            case R.id.intro:
                intent=new Intent(MainActivity.this, IntroActivity.class);
                break;
            case R.id.font:
                 intent=new Intent(MainActivity.this, TypoGraphyActivity.class);
                break;
            case R.id.progress:
                intent = new Intent(MainActivity.this, ProgressActivity.class);
                break;
        }
        startActivity(intent);


    }
}

