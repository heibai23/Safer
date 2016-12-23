package codefirst.safer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import codefirst.safer.R;

/**
 * Created by 灰尘 on 2016/12/22.
 */
//启动页面
public class Lancher extends BaseActivity {

    private Handler handler_skip;   //线程使图片延迟跳转页面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_bg);

        handler_skip=new Handler();
        handler_skip.postDelayed(new Runnable() {       //暂停几秒，实现延时自动跳转界面
            @Override
            public void run() {
                Intent intent_main=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent_main);
                finish();       //结束当前活动
            }
        },3000);        //暂停时间
    }
}
