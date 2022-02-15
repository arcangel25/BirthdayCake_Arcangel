package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private CakeView aCakeView;
    private CakeModel aCakeModel;

    public CakeController(CakeView c){
        aCakeView = c;
        aCakeModel = aCakeView.getCakeModel();
    }


    @Override
    public void onClick(View view) {
        Log.d("button2", "hi");
        aCakeModel.candleLit = false;
        aCakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        aCakeModel.candlesThere = false;
        aCakeView.invalidate();
        Log.d("candleSwitch", "out");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        aCakeModel.numCandles = i;
        aCakeView.invalidate();
        Log.d("seekBar","seeking");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        aCakeModel.XCoord = (int) event.getX();
        aCakeModel.YCoord = (int) event.getY();
        aCakeView.invalidate();
        return false;
    }
}
