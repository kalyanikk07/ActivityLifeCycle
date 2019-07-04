package com.example.kalyani.activitylifecycle;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    EditText editText;
    TextView textView;
    Bundle bundle;
    View v;
    public BlankFragment(){}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("kk","on create fragment called");
        //EditText name_edit = (EditText)findViewById(R.id.edit_name);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.d("kk","onCreateViewfragment called");
        v = inflater.inflate(R.layout.fragment_blank, container, false);

        textView = (TextView)v.findViewById(R.id.name_text);
        if(v != null) {
            textView.setText("Name:  " + this.getArguments().getString("name").toString());
        }
        //    editText = (EditText) v.findViewById(R.id.edit_name);
        return v;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("kk","onAttachfragment called");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("kk","onActivitycreated fargemnt called");

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("kk","onstart fragment called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("kk","onPause fragment called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("kk","onResume fragment called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("kk","onStopfragment called");

    }



    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("kk","onDeatchfragment called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("kk","onDestroyviewfragment called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("kk","onDestroyfragment called");

    }
}



