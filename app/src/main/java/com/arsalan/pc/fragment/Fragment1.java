package com.arsalan.pc.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.arsalan.pc.R;
import com.arsalan.pc.SecondActivity;

public class Fragment1 extends Fragment {

    public static final String TAG="Fragment1";
    private Button buttonFrg1;
    private Button buttonFrg2;
    private Button buttonFrg3;
    private Button buttonNavFrag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        intiViews(view);


        return view;
    }

    private void intiViews(View view){
        buttonFrg1 = view.findViewById(R.id.button1);
        buttonFrg2 = view.findViewById(R.id.button2);
        buttonFrg3 = view.findViewById(R.id.button3);
        buttonNavFrag = view.findViewById(R.id.btn_nav_frag);
    }

    private void clicks(){
        buttonFrg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonFrg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonFrg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonNavFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAct = new Intent(getActivity(), SecondActivity.class);
                startActivity(gotoAct);
            }
        });
    }
}
