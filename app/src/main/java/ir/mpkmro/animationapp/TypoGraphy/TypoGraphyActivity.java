package ir.mpkmro.animationapp.TypoGraphy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ir.mpkmro.animationapp.R;

public class TypoGraphyActivity extends AppCompatActivity {


    LottieFontViewGroup fontView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typo_graphy);


        fontView = findViewById(R.id.fontView);


    }
}
