package codefirst.safer.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import codefirst.safer.R;

/**
 * Created by 灰尘 on 2016/12/22.
 */

public class SettingActivity extends BaseActivity {

    private TextView status_black;      //黑名单状态
    private TextView status_lock;       //程序锁状态
    private Switch mSwitch_black;             //开关
    private Switch mSwitch_lock;
    private Button back_btn;        //返回

//    private String[] settingName={"黑名单拦截设置","程序锁设置"};    //数据源
//    private int[]settingId={R.id.tv_black,R.id.mSwitch};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        init();
        setListener();


    }

    //监听事件的方法
    private void setListener() {
        mSwitch_black.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    status_black.setText("黑名单拦截已开启");
                }  else{
                        status_black.setText("黑名单拦截已关闭");
                  }
            }
        });
        //按钮Switch监听
        mSwitch_lock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    status_lock.setText("黑名单拦截已开启");
                }  else{
                    status_lock.setText("黑名单拦截已关闭");
                  }
            }
        });
        //返回按钮点击事件
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();           //利用销毁当前活动实现返回
            }
        });
    }

    //实例化控件方法
    private void init() {
        status_black= (TextView) findViewById(R.id.tv_blackStatus);
        status_lock= (TextView) findViewById(R.id.tv_lockStatus);
        mSwitch_black= (Switch) findViewById(R.id.switch_black);
        mSwitch_lock= (Switch) findViewById(R.id.switch_lock);

        back_btn= (Button) findViewById(R.id.btn_back);

    }


}
