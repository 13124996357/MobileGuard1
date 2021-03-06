package cn.edu.gdmec.android.mobileguard;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

public class App extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        correctSIM();
    }
    public void correctSIM(){
        SharedPreferences sp=getSharedPreferences("config", Context.MODE_PRIVATE);
        boolean protecting=sp.getBoolean("protecting",true);
        if(protecting){
            String bindsim=sp.getString("sim","");
            TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELECOM_SERVICE);
            String realsim = tm.getSimSerialNumber();
            realsim="999";
            if(bindsim.equals(realsim)){
                Log.i("","SIM卡未发生变化，还是你手机");
            }else{
                Log.i("","SIM卡发生变化了");
                String safenumber=sp.getString("safephone"," ");
                if(!TextUtils.isEmpty(safenumber)){
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(safenumber,null,"你的亲友手机SIM卡已经被更改",null,null);
                }
            }
        }
    }

}
