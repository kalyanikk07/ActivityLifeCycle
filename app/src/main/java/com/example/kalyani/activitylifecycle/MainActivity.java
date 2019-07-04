package com.example.kalyani.activitylifecycle;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView, textView2;
    EditText editText, editText2;
    Button button,button3;
    BlankFragment blankFragment;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView)findViewById(R.id.content1_tv);
        intent = getIntent();
        String message = intent.getStringExtra("msg");
        if (!TextUtils.isEmpty(message)){
            textView2.append(message);
        }

        editText = (EditText) findViewById(R.id.edit_name1);
        editText2 = (EditText) findViewById(R.id.content_edit);
        button = (Button)findViewById(R.id.btn1);
        button3 =(Button)findViewById(R.id.btn3);
        Log.d("activity","on create called");
        button.setOnClickListener(this);
        button3.setOnClickListener(this);
        // Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();

       //  finish();only on create of both fragment and activity and instantly destroys it both activity and fragment
    }

    public void setFragment(Fragment fragment){
        FragmentManager fragmentm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container_1, fragment);
        fragmentTransaction.commit();

    }



    public  void sendData(){
        Bundle bundle = new Bundle();
        bundle.putString("name" , editText.getText().toString());
        blankFragment = new BlankFragment();
        blankFragment.setArguments(bundle);
        editText.setText("");
        setFragment(blankFragment);

    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activity","onStart called");
       // Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();
      //  finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity","onPause called");
        //Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
        //when the application is startin to go into background
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity","onResume called");
        //Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activity","onStop called");
        //Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
        //when the application finally goes into background mode, and activity is no longer visible
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activity","onRestart called");
        //Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity","onDestroy called");
        //Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        if(view == button) {
            String text = editText2.getText().toString();
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("message", text);
           // textview2.setText(text);
            finish();
            startActivity(intent);
            this.overridePendingTransition(0, 0);
            Toast.makeText(getApplicationContext(), " activity 1 clicked", Toast.LENGTH_SHORT).show();
    }
    else {
            Toast.makeText(getApplicationContext(), " activity 1 clicked", Toast.LENGTH_SHORT).show();
            sendData();

        }
    }


}
