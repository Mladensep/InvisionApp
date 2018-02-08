package com.example.invisionapp.activity.activity.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.invisionapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactDetailPageActivity extends AppCompatActivity {

    FrameLayout mainLayer;
    FrameLayout mainLayer2;
    FrameLayout mainLayer3;

    View layer1;
    View layer2;
    View layer3;

    LinearLayout enableLayer1;
    LinearLayout enableLayer2;
    LinearLayout enableLayer3;

    @BindView(R.id.general_id) TextView textView;
    @BindView(R.id.general_id2) TextView textView2;
    @BindView(R.id.general_id3) TextView textView3;

    Boolean check1 = false;
    Boolean check2 = false;
    Boolean check3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail_page);

        ButterKnife.bind(this);

        enableLayer1 = (LinearLayout) findViewById(R.id.spinner);
        mainLayer = (FrameLayout)findViewById(R.id.master);

        LayoutInflater inflater = getLayoutInflater();
        layer1 = inflater.inflate(R.layout.general_detail_layout, null);

        enableLayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(check1 == false) {
                    mainLayer.addView(layer1);
                    textView.setTextColor(Color.parseColor("#007bc7"));
                    check1 = true;
                } else {
                    mainLayer.removeView(layer1);
                    textView.setTextColor(Color.parseColor("#707172"));

                    check1 = false;
                }
            }
        });

        enableLayer2 = (LinearLayout) findViewById(R.id.spinner2);
        mainLayer2 = (FrameLayout)findViewById(R.id.master2);

        LayoutInflater inflater2 = getLayoutInflater();
        layer2 = inflater2.inflate(R.layout.details_detail_layout, null);

        enableLayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(check2 == false) {
                    mainLayer2.addView(layer2);
                    textView2.setTextColor(Color.parseColor("#007bc7"));
                    check2 = true;
                } else {
                    mainLayer2.removeView(layer2);
                    textView2.setTextColor(Color.parseColor("#707172"));

                    check2 = false;
                }
            }
        });

        enableLayer3 = (LinearLayout) findViewById(R.id.spinner3);
        mainLayer3 = (FrameLayout)findViewById(R.id.master3);

        LayoutInflater inflater3 = getLayoutInflater();
        layer3 = inflater3.inflate(R.layout.details_preferences, null);

        enableLayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(check3 == false) {
                    mainLayer3.addView(layer3);
                    textView3.setTextColor(Color.parseColor("#007bc7"));
                    check3 = true;
                } else {
                    mainLayer3.removeView(layer3);
                    textView3.setTextColor(Color.parseColor("#707172"));

                    check3 = false;
                }
            }
        });
    }

    @OnClick(R.id.back_secondw)
    public void nav() {
        Intent intent = new Intent(this, NewNavigationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.back_one)
    public void back1() {
        finish();

    }
}
