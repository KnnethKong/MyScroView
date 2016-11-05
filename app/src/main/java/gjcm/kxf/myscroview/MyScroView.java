package gjcm.kxf.myscroview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2016/11/5.
 */
public class MyScroView extends ScrollView {
    private ScroInterface scroInterface = new ScroInterface() {
        @Override
        public void scroY(int y) {

        }
    };

    public MyScroView(Context context) {
        super(context);
    }

    public MyScroView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScroView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        scroInterface.scroY(getScrollY());
        super.onScrollChanged(l, t, oldl, oldt);
    }

    public void setScroInterface(ScroInterface scroInterface) {
        this.scroInterface = scroInterface;
    }
}
