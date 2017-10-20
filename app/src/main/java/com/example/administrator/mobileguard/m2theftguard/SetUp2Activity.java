package com.example.administrator.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import com.example.administrator.mobileguard.R;

public class SetUp2Activity extends BaseSetUpActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up2);
        ((RadioButton) findViewById(R.id.rb_second)).setChecked(true);

    }

    @Override
    public void showNext() {
        startActivityAndFinishShelf(SetUp3Activity.class);
    }

    @Override
    public void showPre() {
        startActivityAndFinishShelf(SetUp1Activity.class);
    }

}
