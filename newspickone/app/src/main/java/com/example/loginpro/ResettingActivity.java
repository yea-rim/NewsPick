package com.example.loginpro;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ResettingActivity extends AppCompatActivity{
    private static final String TAG = "ResettingActivity";
    private FirebaseAuth mAuth;


        @Override
        protected void onCreate(Bundle savedInstanceState) { // 앱이 실행 될 때 처음 수행 되는 곳
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resetting_pw);
            mAuth=FirebaseAuth.getInstance();
            findViewById(R.id.SendButton).setOnClickListener(onClickListener);


        }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.SendButton:
                    send();
                    break;

            }

        }
    };


            private void send () {

                String email = ((EditText) findViewById(R.id.emailEditText)).getText().toString();

                if (email.length() > 0) {

                    mAuth.sendPasswordResetEmail(email)
                            .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseUser currentUser = mAuth.getCurrentUser();

                                        startToast("이메일을 전송하였습니다");
                                    } else {
                                        if (task.getException() != null) {
                                            startToast(task.getException().toString());
                                        }
                                    }
                                }
                            });

                } else {
                    startToast("이메일을 입력해주세요.");
                }

            }

            private void startToast (String msg){
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show(); //리스너에는 토스트 사용불가 -> 함수를 만들어서 사용
            }
        }


