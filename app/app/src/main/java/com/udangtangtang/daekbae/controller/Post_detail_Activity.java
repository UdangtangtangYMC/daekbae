package com.udangtangtang.daekbae.controller;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.IgnoreExtraProperties;

public class Post_detail_Activity extends AppCompatActivity {


    private ImageView img_consignment, img_delivering, img_complete;
    private TextView txt_consignment, txt_delivering, txt_complete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //뒤로가기
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
