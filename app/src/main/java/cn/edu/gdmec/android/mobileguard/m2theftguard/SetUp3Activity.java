package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.mobileguard.R;


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
