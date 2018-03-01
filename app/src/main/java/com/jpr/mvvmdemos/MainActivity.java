package com.jpr.mvvmdemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneStep(View view){
        Intent intent = new Intent(this , TextViewActivity.class);
        startActivity(intent);
    }

    public void twoStep(View view){
        Intent intent = new Intent(this , ImageViewActivity.class);
        startActivity(intent);
    }

    public void threeStep(View view){
        Intent intent = new Intent(this , RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void fourStep(View view){
        Intent intent = new Intent(this , ListenerActivity.class);
        startActivity(intent);
    }

    public void fiveStep(View view){
        Intent intent = new Intent(this , DoubleBindActivity.class);
        startActivity(intent);
    }

    public void sixStep(View view){
        Intent intent = new Intent(this , DataActivity.class);
        startActivity(intent);
    }


}
