package com.hcx.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv = findViewById(R.id.tv);
         tv.setText(String.format("Task Id: %d\nCurrent activity id: %s",getTaskId(),toString()));

         findViewById(R.id.btnStartSelf).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,MainActivity.class));
             }
         });



    }
}
