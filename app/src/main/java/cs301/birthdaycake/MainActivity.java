package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cvRef = findViewById(R.id.cakeview);
        CakeController cakeControl = new CakeController(cvRef);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(cakeControl);

        Switch candleSwitch = findViewById(R.id.candleSwitch);
        candleSwitch.setOnCheckedChangeListener(cakeControl);

        SeekBar candleSeek = findViewById(R.id.seekBar);
        candleSeek.setOnSeekBarChangeListener(cakeControl);

        cvRef.setOnTouchListener(cakeControl); //fix

    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
