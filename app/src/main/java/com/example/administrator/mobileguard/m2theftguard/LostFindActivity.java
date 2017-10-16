package com.example.administrator.mobileguard.m2theftguard;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.administrator.mobileguard.R;

import java.util.List;

/**
 * Created by Administrator on 2017/10/16 0016.
 */

public class LostFindActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_find);
        startSetup1Activity();
    }

    private void startSetup1Activity() {
        Intent intent = new Intent(LostFindActivity.this, SetUp1Activity.class);
        startActivity(intent);
        finish();
    }
}
