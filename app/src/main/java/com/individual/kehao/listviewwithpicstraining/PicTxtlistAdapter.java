package com.individual.kehao.listviewwithpicstraining;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/*
 * Project Name: ListviewWithPicsTraining
 * Package Name: com.individual.kehao.listviewwithpicstraining
 * File    Name: PicTxtPicAdapter
 * Create  By:   Ke Hao
 * Create  Time: 2018/9/22
 * Description :
 */
public class PicTxtlistAdapter extends BaseAdapter {

    private List<ListItemEntity> list;
    private ListItemEntity item;
    private LayoutInflater inflater;
    private Context context;

    public PicTxtlistAdapter (List<ListItemEntity> list, Context context){
        this.list = list;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        item = list.get(i);

        ViewHolder viewHolder = null;
        if (view==null){
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.items, null);
            viewHolder.tv_skoop = view.findViewById(R.id.tv_skoop);
            viewHolder.tv_time = view.findViewById(R.id.tv_time);
            viewHolder.tv_userName = view.findViewById(R.id.tv_username);
            view.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.tv_userName.setText(item.getUserName());
        viewHolder.tv_time.setText(item.getTime());
        viewHolder.tv_skoop.setText(item.getSkoop());

        return view;
    }

    class ViewHolder{
        private TextView tv_userName;
        private TextView tv_time;
        private TextView tv_skoop;
//        private ImageView iv_userPicUrl;
//        private ImageView iv_skoopPicUrl;
    }
}
