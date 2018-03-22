package com.example.josh.slot_machine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private ImageView slot1;
    private ImageView slot2;
    private ImageView slot3;
    private SeekBar speed;
    private Button start;
    private Button rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slot1 = findViewById(R.id.Slot1);
        slot2 = findViewById(R.id.Slot2);
        slot3 = findViewById(R.id.Slot3);
        speed = findViewById(R.id.speedBar);
        start = findViewById(R.id.StartButton);
        rules = findViewById(R.id.RuleButton);

        speed.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


    }

    public void startPressed(View v){


    }
}
