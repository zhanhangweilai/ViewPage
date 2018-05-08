package com.example.lh.viewpagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv;
    private MyParcelable myParcelable;
    private MySerializable mySerializable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);
        mySerializable = (MySerializable) getIntent().getSerializableExtra("parcel");
        tv.setText(mySerializable.toString());
       // myParcelable =  getIntent().getParcelableExtra("parcel");
       // Log.i("lihangSecondActivity","age ="+myParcelable.toString());
       // tv.setText(myParcelable.toString());
    }
}
