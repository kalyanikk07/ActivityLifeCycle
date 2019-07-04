package com.example.kalyani.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView textView3;
    Button button2;
    Intent intent2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button)findViewById(R.id.btn2);
        editText = (EditText)findViewById(R.id.content_edit2);

        textView3 = (TextView)findViewById(R.id.content2_tv);
        intent2 = getIntent();
        String message = intent2.getStringExtra("message");
        if (!TextUtils.isEmpty(message)) {
            textView3.append(message);
        }

        Log.d("activity","on create activity2 called");
       // Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();
        button2.setOnClickListener(this);
    }

    protected void onStart() {
        super.onStart();
        Log.d("activity","onStart activity2 called");
       // Toast.makeText(getApplicationContext(), "onStart activity2 called", Toast.LENGTH_SHORT).show();
        //  finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity","onPause activity2 called");
       // Toast.makeText(getApplicationContext(), "onPause activity2 called", Toast.LENGTH_SHORT).show();
        //when the application is startin to go into background
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity","onResume called");
       // Toast.makeText(getApplicationContext(), "onResume activity2 called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activity","onStop called");
      //  Toast.makeText(getApplicationContext(), "onStop activity2 called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activity","onRestart called");
      //  Toast.makeText(getApplicationContext(), "onRestart activity2 called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity","onDestroy called");
      //  Toast.makeText(getApplicationContext(), "onDestroy activity2 called", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
       String retrunText = editText.getText().toString();
        intent2 = new Intent(MainActivity2.this, MainActivity.class);
        intent2.putExtra("msg",retrunText );

        finish();
        startActivity(intent2);
        this.overridePendingTransition(0, 0);


        Toast.makeText(getApplicationContext(), " activity 2 clicked", Toast.LENGTH_SHORT).show();

    }

   /* @Override
    public void onBackPressed() {
        finishAffinity();
    }*/


}
