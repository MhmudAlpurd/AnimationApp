package ir.mpkmro.animationapp.Sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import ir.mpkmro.animationapp.R;

public class SampleActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);


        lottieAnimationView = findViewById(R.id.simple);
        lottieAnimationView.setAnimation("watermelon.json");
        lottieAnimationView.loop(true);
        lottieAnimationView.playAnimation();





    }
}
