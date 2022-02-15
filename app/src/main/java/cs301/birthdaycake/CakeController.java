package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private CakeView aCakeView;
    private CakeModel aCakeModel;
    private int xVal;
    private int yVal;

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
    public boolean onTouch(View view, MotionEvent motionEvent) {
        xVal = (int)motionEvent.getX();
        yVal = (int)motionEvent.getY();
        aCakeModel.xClick = xVal;
        aCakeModel.yClick = yVal;
        aCakeView.invalidate();
        aCakeModel.drawBalloon = true;
        return true;
    }
}
