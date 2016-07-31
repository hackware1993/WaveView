package net.lucode.hackware.waveview;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WaveView mWaveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWaveView = (WaveView) findViewById(R.id.wave_view);

/*        mWaveView.setDuration(5000);
        mWaveView.setStyle(Paint.Style.STROKE);
        mWaveView.setSpeed(400);
        mWaveView.setColor(Color.RED);
        mWaveView.setInterpolator(new AccelerateInterpolator(1.2f));
        mWaveView.start();*/

        mWaveView.setDuration(5000);
        mWaveView.setStyle(Paint.Style.FILL);
        mWaveView.setColor(Color.RED);
        mWaveView.setInterpolator(new LinearOutSlowInInterpolator());
        mWaveView.start();

        mWaveView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mWaveView.stop();
            }
        }, 10000);
    }
}
