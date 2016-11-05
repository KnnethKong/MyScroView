package gjcm.kxf.myscroview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements ScroInterface {
    private int PMKD = 0, PMGD = 0;
    private MyScroView myScroView;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PMKD = getResources().getDisplayMetrics().widthPixels;
        PMGD = getResources().getDisplayMetrics().heightPixels;
        setContentView(R.layout.activity_main);
        myScroView = (MyScroView) findViewById(R.id.main_sro);
        linearLayout = (LinearLayout) findViewById(R.id.main_liner);
        myScroView.setScroInterface(this);
    }

    @Override
    public void scroY(int y) {
        Log.i("kxflog", y + "-------->");
        if (y < 20) {
            linearLayout.setVisibility(View.INVISIBLE);
            AlphaAnimation aa = new AlphaAnimation(0.0f, 1.0f);
            aa.setDuration(1000);
            aa.setFillAfter(true);
            linearLayout.startAnimation(aa);
        } else {
            linearLayout.setVisibility(View.INVISIBLE);
            AlphaAnimation aa = new AlphaAnimation(1.0f, 0.0f);
            aa.setDuration(800);
            aa.setFillAfter(true);
            linearLayout.startAnimation(aa);
        }


    }
}
