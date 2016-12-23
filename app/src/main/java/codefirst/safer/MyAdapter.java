package codefirst.safer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 灰尘 on 2016/12/20.
 */
/**
 * 自定义适配器，接受数据源
 * */
public class MyAdapter extends BaseAdapter {

    private List<ResourceItem>mDataList;     //使用泛型ResourceItem
    private LayoutInflater mLayoutInflater;   //将View变为一个Layout布局
    private ResourceItem resItem;

    private ImageView imageView;    //控件 存储
    private TextView textView;

    public MyAdapter(Context context, List<ResourceItem> dataList) {
        mLayoutInflater=LayoutInflater.from(context);
        mDataList = dataList;
    }


    //获得
    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //返回每一项的内容
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view=mLayoutInflater.inflate(R.layout.item_resource,null);     //需要装载到item中布局文件
        imageView= (ImageView) view.findViewById(R.id.iv_name);
        textView= (TextView) view.findViewById(R.id.tv_name);
        ResourceItem item=mDataList.get(position);
        imageView.setImageResource(item.imageId);
        textView.setText(item.itemName);
        return view;

    }
}
