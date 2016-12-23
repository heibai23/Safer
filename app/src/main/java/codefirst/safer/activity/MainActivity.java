package codefirst.safer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import codefirst.safer.MyAdapter;
import codefirst.safer.R;
import codefirst.safer.ResourceItem;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<ResourceItem>dataList; //数据源
    private ImageView imageView;    //主页面首图
    private GridView gridView;  //视图
    private int []imageId={R.mipmap.safe,R.mipmap.callmsgsafe,R.mipmap.app,R.mipmap.trojan,
            R.mipmap.sysoptimize,R.mipmap.taskmanager,R.mipmap.netmanager,R.mipmap.atools,
            R.mipmap.settings};
    private String[]imageName={"手机防盗","通讯卫士","软件管家","手机杀毒","缓存清理","进程管理",
            "流量统计","高级工具","设置中心"};

    private String[]intentName={"sjfd"};  //Activity每一个的界面Intent
    //private final int intPosition;      //获取

    private MyAdapter adapter;      //适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);      //全屏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        adapter=new MyAdapter(this,dataList);       //通过自定义的MyAdapter生成适配器
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);

        createIntent();

    }
    //创建跳转页面的统一方法
    private void createIntent() {

    }

    private void init() {
        gridView= (GridView) findViewById(R.id.gv_layout);
        dataList=new ArrayList<ResourceItem>();             //实例化数据源对象

        for (int i = 0; i <imageId.length ; i++) {
            dataList.add(new ResourceItem(imageId[i],imageName[i]));    //数据源对象通过泛型生成
            }
    }

    //监听事件

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view,int position, long l) {
        //final int intPosition=position;
        switch (position){
            case 0:
                Intent intent_killVirus=new Intent(getApplicationContext(),KillVirusActivity.class);
                startActivity(intent_killVirus);
                break;
            case 1:
                Intent intent_connect=new Intent(getApplicationContext(),ConnectActivity.class);
                startActivity(intent_connect);

                break;
            case 2:  ;

                break;
            case 3:  ;

                break;
            case 4:  ;

                break;
            case 5:  ;

                break;
            case 6:  ;

                break;
            case 7:  ;

                break;
            case 8:
                Intent intent_set=new Intent(getApplicationContext(),SettingActivity.class);
                startActivity(intent_set);;

                break;
        }


    }
}
