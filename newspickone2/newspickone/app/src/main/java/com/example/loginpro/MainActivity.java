package com.example.loginpro;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
    private frag5_setting frag5_setting;
    private MainActivity MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
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
                    case R.id.active_person:
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
        frag5_setting = new frag5_setting();
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
                ft.replace(R.id.main_frame,
                        frag5_setting);
                ft.commit(); //저장을 의미
                break;


        }

    }

    //frag1 화면이동 함수(아래 부터)
    public void KbsFrag() //kbs 화면전환
    {
        Fragment frag1kbs = new frag1_kbs();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1kbs);
        transaction.commit();
    }
    public void SbsFrag() //sbs화면전환
    {
        Fragment frag1sbs = new frag1_sbs();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1sbs);
        transaction.commit();
    }
    public void MbcFrag() //mbc화면전환
    {
        Fragment frag1mbc = new frag1_mbc();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1mbc);
        transaction.commit();
    }
    public void MbnFrag() //mbn 화면전환
    {
        Fragment frag1mbn = new frag1_mbn();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1mbn);
        transaction.commit();
    }
    public void JoongangFrag() //중앙일보 화면전환
    {
        Fragment frag1joongang = new frag1_joongang();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1joongang);
        transaction.commit();
    }
    public void JtbcFrag() //jtbc 화면전환
    {
        Fragment frag1jtbc = new frag1_jtbc();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1jtbc);
        transaction.commit();
    }
    public void YtnFrag() //ytn 화면전환
    {
        Fragment frag1ytn = new frag1_ytn();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1ytn);
        transaction.commit();
    }
    public void ChosunFrag() //조선일보 화면전환
    {
        Fragment frag1chosun = new frag1_chosun();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1chosun);
        transaction.commit();
    }
    public void DongaFrag() //동아일보 화면전환
    {
        Fragment frag1donga = new frag1_donga();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1donga);
        transaction.commit();
    }
    public void HanFrag() //한겨례 화면전환
    {
        Fragment frag1han = new frag1_han();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,frag1han);
        transaction.commit();
    }
    //frag1 화면이동 함수(위까지)

    //frag2 화면이동 함수 (아래부터)
    public void ChungcheonFrag()
    {
        Fragment frag2chungcheon = new frag2_chungcheongdo();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2chungcheon);
        transaction.commit();
    }
    public void GyeonggiFrag()
    {
        Fragment frag2gyeonggi = new frag2_gyeonggido();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2gyeonggi);
        transaction.commit();
    }
    public void GangwonFrag()
    {
        Fragment frag2gangwon = new frag2_gangwondo();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2gangwon);
        transaction.commit();
    }
    public void GyeongsangFrag()
    {
        Fragment frag2gyeongsang = new frag2_gyeongsangdo();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2gyeongsang);
        transaction.commit();
    }
    public void IncheonFrag()
    {
        Fragment frag2incheon = new frag2_incheon();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2incheon);
        transaction.commit();
    }
    public void JejuFrag()
    {
        Fragment frag2jeju = new frag2_jeju();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2jeju);
        transaction.commit();
    }
    public void SeoulFrag()
    {
        Fragment frag2seoul = new frag2_seoul();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2seoul);
        transaction.commit();
    }
    public void JeolladoFrag()
    {
        Fragment frag2jeolla = new frag2_jeollado();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, frag2jeolla);
        transaction.commit();
    }
    //frag2 화면 이동 함수 끝(위 까지)



}

