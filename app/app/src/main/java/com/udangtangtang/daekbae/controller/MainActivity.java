package com.udangtangtang.daekbae.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.udangtangtang.daekbae.R;
import com.udangtangtang.daekbae.controller.Input_post_dialog;

public class MainActivity extends AppCompatActivity {
    //파이어베이스 연동 부분
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference - 데이터베이스의 특정 위치로 연결하는 거라고 생각하면 됨.
    //현재 연결은 데이터베이스에만 딱 연결해놓고 키값(테이블또는 속성)의 위치까지는 들어가지는 않은 모습
    private DatabaseReference databaseReference = database.getReference();


    private long time = 0;
    private DrawerLayout drawerLayout;
    private View drawerView;
    
    private RecyclerView recyclerview; //이용자가 등록한 운송장번호에 대한 정보를 담는 리스트
    private ImageButton btn_add; //이용자가 운송장번호 추가할 때 사용하는 버튼
    private TextView tv_id; //ID를 받아오기위한 속성
    private ImageButton btn_logout; //로그아웃을 위한 버튼

    private String[] post_company_list = {"DHL", "천일 택배", "CJ대한통운", "CU편의점택배", "GS Postbox택배",
            "CWAY", "대신택배", "우체국 택배", "한의사랑택배", "한진택배",
            "합동택배", "홈픽", "일양로지스", "경동택배", "로젠택배",
            "롯데택배"};


    private int[] post_company_imageID ={R.drawable.cheonil_post, R.drawable.cjkoreaexpress, R.drawable.cjkoreaexpress, R.drawable.cupost, R.drawable.cvsnet_post,
            R.drawable.woori, R.drawable.daesintaegbae_post, R.drawable.post_delivery_service, R.drawable.hpl, R.drawable.hangincourier,
            R.drawable.habdongtaegbae_post, R.drawable.homepick_post, R.drawable.ilyang_post, R.drawable.kyungdong_post, R.drawable.rosencourier,
            R.drawable.lottecourier};

    private long[] input_post_info;

    //새로고침 구현
    private void refreshListView(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        //메뉴창 슬라이드로 열리게끔 구현
        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        //메뉴창 닫기 구현
        ImageButton close = (ImageButton)findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() { //메뉴 닫기 버튼 누를 때 닫기
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });


        btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input_post_dialog input_post_dialog = new Input_post_dialog(MainActivity.this, post_company_list);
                input_post_info = input_post_dialog.callFunction();
                if(input_post_info != null){
                    //input_post_info[0] - 택배회사 index, input_post_info[1] - 입력한 운송장 번호
                    //입력한 택배회사와 입력한 운송장 번호에 따른 정보를 기반으로 api 호출 및 Json으로 각각의 정보를 빼오고
                    //이이를 기반으로 ost instance 생성
                }
            }
        });


    }

    //메뉴창
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_btn1:
                //메뉴창 오픈
                drawerLayout.openDrawer(drawerView);
                return true;
            case R.id.refresh:
                refreshListView();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //뒤로가기 버튼을 두번누르면 종료
    @Override
    public void onBackPressed(){
        if (System.currentTimeMillis() - time >= 2000) {
            time = System.currentTimeMillis();
            Toast.makeText(getApplicationContext(), "뒤로가기 버튼을 한번 더 누르면 종료합니다.", Toast.LENGTH_SHORT).show();
        } else if (System.currentTimeMillis() - time < 2000) {
            finish();
        }
    }

    //사용자가 등록한 post_list를 가져옴
    public void getPost_list(){
    }

}

