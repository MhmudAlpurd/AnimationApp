package ir.mpkmro.animationapp.Progress;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import ir.mpkmro.animationapp.R;

public class ProgressActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    SeekBar seekBar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);


        lottieAnimationView = findViewById(R.id.lottie_Animation);
        seekBar = findViewById(R.id.lottie_SeekBar);
        textView = findViewById(R.id.lottie_TXT);

        lottieAnimationView.setAnimation("motorcycle.json");


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lottieAnimationView.setProgress((float) progress / 100);
                int precent = (int) (lottieAnimationView.getProgress() * 100);
                textView.setText(precent + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
