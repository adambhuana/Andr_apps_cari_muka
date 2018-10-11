package com.example.adampuspabhuana.carimuka;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.ImageView;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity{
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    rg=(RadioGroup) findViewById(R.id.nilai);
    rg.setOnCheckedChangeListener(rg2);
    }
    RadioGroup.OnCheckedChangeListener rg2= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(checkedId)
            {
                case R.id.cool:
                    AlertDialog.Builder oce = new AlertDialog.Builder(MainActivity.this);
                    oce.setMessage("Wow Keren");
                    oce.show();
                    break;
                case R.id.soso:
                    AlertDialog.Builder oce1 = new AlertDialog.Builder(MainActivity.this);
                    oce1.setMessage("Just So So");
                    oce1.show();
                    break;
            }
        }
    };

}
