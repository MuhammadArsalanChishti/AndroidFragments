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

import com.arsalan.pc.MainActivity;
import com.arsalan.pc.R;
import com.arsalan.pc.SecondActivity;

public class Fragment3 extends Fragment {

    public static final String TAG="Fragment3";
    private Button buttonFrg1;
    private Button buttonFrg2;
    private Button buttonFrg3;
    private Button buttonNavFrag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3_layout,container,false);
        intiViews(view);
        clicks();

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
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        buttonFrg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        buttonFrg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(2);
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
