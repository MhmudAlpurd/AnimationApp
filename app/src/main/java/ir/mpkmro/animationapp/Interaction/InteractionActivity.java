package ir.mpkmro.animationapp.Interaction;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import ir.mpkmro.animationapp.R;

public class InteractionActivity extends AppCompatActivity implements View.OnClickListener {
    LottieAnimationView animatedRadioButton, animatedSwitchButton, animatedHamburger, animatedMute;
    Boolean hamburgerIsOpen = false, switchIsOn = false, isMute = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);


        animatedHamburger = findViewById(R.id.animatedHamburger);
        animatedSwitchButton = findViewById(R.id.animatedSwitchButton);
        animatedRadioButton = findViewById(R.id.animatedRadioButton);
        animatedMute = findViewById(R.id.animatedMute);

        animatedHamburger.setOnClickListener(this);
        animatedSwitchButton.setOnClickListener(this);
        animatedRadioButton.setOnClickListener(this);
        animatedMute.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.animatedRadioButton:
                selectRadioButton();
                break;
            case R.id.animatedSwitchButton:
                selectSwitchButton();
                break;
            case R.id.animatedHamburger:
                selectHambergurButton();
                break;
            case R.id.animatedMute:
                selectMuteButton();
                break;


        }


    }

    private void selectHambergurButton() {
        ValueAnimator valueAnimator;

        if (!hamburgerIsOpen) {
            valueAnimator = ValueAnimator.ofFloat(0.05f, 0.45f).setDuration(2000);
            hamburgerIsOpen = true;
        } else {
            valueAnimator = ValueAnimator.ofFloat(0.45f, 0.05f).setDuration(2000);
            hamburgerIsOpen = false;
        }

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animatedHamburger.setProgress((Float) animation.getAnimatedValue());
            }
        });

        valueAnimator.start();
    }

    private void selectRadioButton() {
        if (animatedRadioButton.getProgress() != 1.0)
            animatedRadioButton.playAnimation();

        else
            animatedRadioButton.setProgress(0.0f);
    }

    private void selectSwitchButton() {
        if (switchIsOn) {
            animatedSwitchButton.setProgress(0);
            switchIsOn = false;
        } else {
            animatedSwitchButton.playAnimation();
            switchIsOn = true;
        }
    }

    private void selectMuteButton() {
        if (!isMute) {
            animatedMute.playAnimation();
            isMute = true;
        } else {
            animatedMute.setProgress(0);
            isMute = false;
        }


    }
}
