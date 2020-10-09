package com.example.loginpro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class frag2 extends Fragment{
    private TextView seoul;
    private TextView incheon;
    private TextView gyeongsang;
    private TextView gyeonggi;
    private TextView jeolla;
    private TextView chungcheong;
    private TextView gangwon;
    private TextView jeju;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag2, container, false);

        seoul = view.findViewById(R.id.seoul);
        incheon = view.findViewById(R.id.incheon);
        gyeongsang = view.findViewById(R.id.kungsang);
        gyeonggi = view.findViewById(R.id.kug);
        jeolla = view.findViewById(R.id.jun);
        chungcheong = view.findViewById(R.id.cung);
        gangwon = view.findViewById(R.id.wondo);
        jeju = view.findViewById(R.id.jeju);

        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).SeoulFrag();

            }
        });

        incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).IncheonFrag();
            }
        });

        gyeongsang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).GyeongsangFrag();
            }
        });

        gyeonggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).GyeonggiFrag();
            }
        });

        jeolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).JeolladoFrag();
            }
        });

        chungcheong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).ChungcheonFrag();
            }
        });

        gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).GangwonFrag();
            }
        });

        jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).JejuFrag();
            }
        });


        return view;
    }
}


