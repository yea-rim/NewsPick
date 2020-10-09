package com.example.loginpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;


public class frag5_setting extends Fragment implements View.OnClickListener{


private TextView btn_unuser;
    private FirebaseAuth mAuth;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.frag5, container, false);

        btn_unuser = view.findViewById(R.id.account);
        mAuth = FirebaseAuth.getInstance();
        btn_unuser.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {


        getActivity().startActivity(new Intent(getActivity(), ProfileActivity.class));
    }
}