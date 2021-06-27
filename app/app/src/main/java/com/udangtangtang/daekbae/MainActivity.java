package com.udangtangtang.daekbae;

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

public class MainActivity extends AppCompatActivity {
    private long time = 0;
    private DrawerLayout drawerLayout;
    private View drawerView;
    
    private RecyclerView recyclerview; //이용자가 등록한 운송장번호에 대한 정보를 담는 리스트
    private ImageButton btn_add; //이용자가 운송장번호 추가할 때 사용하는 버튼
    private TextView tv_id; //ID를 받아오기위한 속성
    private ImageButton btn_logout; //로그아웃을 위한 버튼
    
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
                Input_post_dialog input_post_dialog = new Input_post_dialog(MainActivity.this);
                input_post_dialog.callFunction();
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
}

