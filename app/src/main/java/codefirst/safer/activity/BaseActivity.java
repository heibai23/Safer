package codefirst.safer.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by 灰尘 on 2016/12/20.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
