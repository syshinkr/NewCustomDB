package com.example.admin.newcustomdb.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.admin.newcustomdb.DBType.AniList;
import com.example.admin.newcustomdb.R;

import java.util.ArrayList;

/**
 * Created by admin on 2017-12-27.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    ArrayList<AniList> aniListArr;

    public RecyclerAdapter(ArrayList<AniList> arr) {
        aniListArr = arr;
    }

    @Override
    public int getItemCount() {
        return aniListArr.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(aniListArr.get(position).getTitle());
        holder.genreTime.setText(aniListArr.get(position).getGenreTime());
    }

    public ArrayList<AniList> getAniListArr() {
        return aniListArr;
    }

    public void setAniListArr(ArrayList<AniList> aniListArr) {
        this.aniListArr = aniListArr;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView genreTime;
        private ImageButton heart;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title);
            this.genreTime = itemView.findViewById(R.id.genreTime);
            this.heart = itemView.findViewById(R.id.heart);
        }
    }
}
