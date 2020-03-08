package com.example.loginpro;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; //bottomnavigationview
    private FragmentManager fm;
    private FragmentTransaction ft;
    private frag1 frag1;
    private frag2 frag2;
    private frag3 frag3;
    private frag4 frag4;
    private frag5 frag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.active_home:
                        setFrag(0);
                        break;
                    case R.id.active_map:
                        setFrag(1);
                        break;
                    case R.id.active_subscribe:
                        setFrag(2);
                        break;
                    case R.id.active_script:
                        setFrag(3);
                        break;
                    case R.id.active_user:
                        setFrag(4);
                        break;
                }
                return true;
            }
        });
        frag1 = new frag1();
        frag2 = new frag2();
        frag3 = new frag3();
        frag4 = new frag4();
        frag5 = new frag5();
        setFrag(0);//첫 fragment 화면을 지정

        }



    //fragment 교체가 이루어지는 부분
    private void setFrag(int n){

    fm = getSupportFragmentManager();
    ft = fm.beginTransaction(); //실질적인 fragment교체
        switch (n){
            case 0:
                ft.replace(R.id.main_frame,frag1);
                ft.commit(); //저장을 의미
                break;
            case 1:
                ft.replace(R.id.main_frame,frag2);
                ft.commit(); //저장을 의미
                break;
            case 2:
                ft.replace(R.id.main_frame,frag3);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame,frag4);
                ft.commit(); //저장을 의미
                break;
            case 4:
                ft.replace(R.id.main_frame,frag5);
                ft.commit(); //저장을 의미
                break;

        }


}
}
