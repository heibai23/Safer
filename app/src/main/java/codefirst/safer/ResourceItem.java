package codefirst.safer;

/**
 * Created by chen on 2016/12/20.
 */

import codefirst.safer.activity.BaseActivity;

/***
 * 用于获取资源
 */
public class ResourceItem extends BaseActivity {
    public  int imageId;            //图片的ID   （其他类要调用）
    public  String itemName;        //图标的名称

    public ResourceItem(int resourceImageId, String resourceItemName) {
       imageId=resourceImageId;
        itemName=resourceItemName;
    }


}
