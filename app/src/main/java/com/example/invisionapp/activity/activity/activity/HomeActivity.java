package com.example.invisionapp.activity.activity.activity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;

import com.example.invisionapp.R;

import com.example.invisionapp.activity.activity.fragment.NavigationDrawerFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        //setUpDrawer();

    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPref = this.getSharedPreferences("naziv1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("edit1", 10);
        editor.commit();
    }

    @OnClick(R.id.new_navigation)
    public void nav() {
        Intent intent = new Intent(this, NewNavigationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.contact_id)
    public void cont () {
        Intent intent = new Intent(this, ContactActivity.class);

        String strName = "1";
        intent.putExtra("STRING_I_NEED", strName);

        startActivity(intent);
    }

    @OnClick(R.id.countries)
    public void countries() {
        Intent intent = new Intent(this, ContactActivity.class);

        String strName = "2";
        intent.putExtra("STRING_I_NEED", strName);

        startActivity(intent);
    }

    @OnClick(R.id.embas)
    public void embas() {
        Intent intent = new Intent(this, ContactActivity.class);

        String strName = "3";
        intent.putExtra("STRING_I_NEED", strName);

        startActivity(intent);
    }

    private void setUpDrawer() {

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drwr_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerFragment.setUpDrawer(R.id.nav_drwr_fragment, drawerLayout, toolbar);
    }

}
