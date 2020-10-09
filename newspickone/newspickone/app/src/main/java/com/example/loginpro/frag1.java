package com.example.loginpro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag1 extends Fragment{
    ImageButton kbs,sbs,mbc,mbn,joongang,jtbc,ytn,chosun,donga,han;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.frag1,container,false);


        kbs= rootview.findViewById(R.id.ass1);
        sbs= rootview.findViewById(R.id.ass2);
        mbc= rootview.findViewById(R.id.ass3);

        mbn= rootview.findViewById(R.id.ass4);
        joongang= rootview.findViewById(R.id.ass5);
        jtbc= rootview.findViewById(R.id.ass6);

        ytn= rootview.findViewById(R.id.ass7);
        chosun= rootview.findViewById(R.id.ass8);
        donga= rootview.findViewById(R.id.ass9);
        han= rootview.findViewById(R.id.ass10);


        kbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).KbsFrag(); //kbs 화면 넘어가는 함수 호출
            }
        });
        sbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).SbsFrag(); //sbs 화면 넘어가는 함수 호출
            }
        });
        mbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).MbcFrag(); //mbc 화면 넘어가는 함수 호출
            }
        });
        jtbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).JtbcFrag(); //jtbc 화면 넘어가는 함수 호출
            }
        });
        ytn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).YtnFrag(); // ytn화면 넘어가는 함수 호출
            }
        });
        chosun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).ChosunFrag(); //chosun 화면 넘어가는 함수 호출
            }
        });
        donga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).DongaFrag(); //donga화면 넘어가는 함수 호출
            }
        });
        han.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).HanFrag(); //han 화면 넘어가는 함수 호출
            }
        });

        return rootview;
    }

}
