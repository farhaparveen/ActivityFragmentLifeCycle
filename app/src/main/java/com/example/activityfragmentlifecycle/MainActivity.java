package com.example.activityfragmentlifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TagActivity","onCreate");
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment1=new Fragment1();
//This code is for attaching a fragment to an activity
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.add(R.id.container_frag,fragment1);
                transaction.commit();


            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TagActivity","OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TagActivity","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TagActivity","onResume");
    }




    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TagActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TagActivity","onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TagActivity","onDestroy");
    }
}
