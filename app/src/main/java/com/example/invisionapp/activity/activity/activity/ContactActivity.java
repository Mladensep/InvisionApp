package com.example.invisionapp.activity.activity.activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.invisionapp.R;
import com.example.invisionapp.activity.activity.adapter.RecyclerAdapter;
import com.example.invisionapp.activity.activity.fragment.NavigationDrawerFragment;
import com.example.invisionapp.activity.activity.model.Landscape;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContactActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.toolbar_title) TextView textView;
    @BindView(R.id.recyclerView) RecyclerView recyclerView;

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ButterKnife.bind(this);


        Bundle bundle = getIntent().getExtras();
        String sc = bundle.getString("STRING_I_NEED");


        if (sc.equals("1")) {
            textView.setText("Contacts");
            adapter = new RecyclerAdapter(this, Landscape.getData());
        } else if (sc.equals("2")) {
            textView.setText("Countries");
            adapter = new RecyclerAdapter(this, Landscape.getData2());
        } else if (sc.equals("3")) {
            textView.setText("Embassies & Consulates");
            adapter = new RecyclerAdapter(this, Landscape.getData3());
        }

        recyclerView.setAdapter(adapter);

        setUpDrawer();

        setUpRecyclerView();
    }

    private void setUpDrawer() {

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drwr_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerFragment.setUpDrawer(R.id.nav_drwr_fragment, drawerLayout, toolbar);
    }

    private void setUpRecyclerView() {

//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        RecyclerAdapter adapter = new RecyclerAdapter(this, Landscape.getData());
//        recyclerView.setAdapter(adapter);

        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(this); // (Context context, int spanCount)
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
