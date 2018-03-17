package com.example.admin.newcustomdb.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.newcustomdb.DBType.AniList;
import com.example.admin.newcustomdb.R;

import java.util.ArrayList;

/**
 * Created by admin on 2017-12-27.
 */

public class CustomAdapter extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<AniList> aniListArr;
    private ViewHolder viewHolder;

    public CustomAdapter(Context c, ArrayList<AniList> arr) {
        this.inflater = LayoutInflater.from(c);
        this.aniListArr = arr;
    }

    @Override
    public int getCount() {
        return aniListArr.size();
    }

    @Override
    public Object getItem(int arg) {
        return null;
    }

    @Override
    public long getItemId(int arg) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;
        if(v == null) {
            viewHolder = new ViewHolder();
            v = inflater.inflate(R.layout.list_row, null);
            viewHolder.title = v.findViewById(R.id.title);
            viewHolder.subInfo = v.findViewById(R.id.subInfo);

            v.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) v.getTag();
        }
        viewHolder.title.setText(aniListArr.get(position).getTitle());
        viewHolder.subInfo.setText(aniListArr.get(position).getGenre());

        return v;
    }

    public ArrayList<AniList> getAniListArr() {
        return aniListArr;
    }

    public void setAniListArr(ArrayList<AniList> aniListArr) {
        this.aniListArr = aniListArr;
    }

    private class ViewHolder {
        TextView title;
        TextView subInfo;
        TextView period;
        TextView link;
        TextView day;
    }
}
