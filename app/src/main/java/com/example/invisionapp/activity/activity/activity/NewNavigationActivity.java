package com.example.invisionapp.activity.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.invisionapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_navigation);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.back_one)
    public void back1() {
        finish();

    }

    @OnClick(R.id.back_second)
    public void back2() {
        finish();

    }

}
