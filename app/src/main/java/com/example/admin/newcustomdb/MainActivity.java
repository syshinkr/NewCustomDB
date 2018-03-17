package com.example.admin.newcustomdb;

import android.database.Cursor;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.newcustomdb.Adapter.RecyclerAdapter;
import com.example.admin.newcustomdb.DB.DBOpenHelper;
import com.example.admin.newcustomdb.DBType.AniList;
import com.example.admin.newcustomdb.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private DBOpenHelper mDBOpenHelper;
    private Cursor mCursor;
    private AniList minfo;
    private ArrayList<AniList> mAniListArr = new ArrayList<>();
    private RecyclerView.Adapter mAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //성능 개선 - 각 Item 들이 RecyclerView 의 전체 크기를 변경하지 않는다면 true
        activityMainBinding.recyclerView.setHasFixedSize(true);

        mAdapter = new RecyclerAdapter(mAniListArr);
        activityMainBinding.recyclerView.setAdapter(mAdapter);

        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setDivider(); //리사이클러뷰 아이템간 구분선
    }
    public void setData() {
        mAniListArr.clear();
//        mAdapter.notifyItemChanged();
        mAdapter.notifyDataSetChanged();
    }

    private void setDivider() {
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(getApplicationContext(), new LinearLayoutManager(this).getOrientation());
        activityMainBinding.recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
