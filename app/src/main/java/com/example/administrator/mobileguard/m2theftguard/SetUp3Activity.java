package com.example.administrator.mobileguard.m2theftguard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.administrator.mobileguard.R;


public class SetUp3Activity extends BaseSetUpActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up3);
        ((RadioButton) findViewById(R.id.rb_third)).setChecked(true);

    }

    @Override
    public void showNext() {
        startActivityAndFinishShelf(SetUp4Activity.class);
    }

    @Override
    public void showPre() {
        startActivityAndFinishShelf(SetUp2Activity.class);
    }
}
