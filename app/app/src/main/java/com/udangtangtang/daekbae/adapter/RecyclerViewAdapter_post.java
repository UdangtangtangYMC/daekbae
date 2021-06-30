package com.udangtangtang.daekbae.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.udangtangtang.daekbae.R;
import com.udangtangtang.daekbae.model.Post;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter_post extends RecyclerView.Adapter<RecyclerViewAdapter_post.MyViewHolder>{
    private List<Post> post_list = new ArrayList<>();
    private int[] postCompany_list = new int[20];

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_postCompany; //택배회사 로고 사진을 담기위한 위젯
        private TextView txt_postCompany; //택배회사명을 담기위한 위젯
        private TextView txt_transportDocumentNumber; //운송장번호를 담기위한 위젯
        private TextView txt_date; //등록일자를 담기위한 위젯

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_postCompany = itemView.findViewById(R.id.img_postCompany);
            txt_postCompany = itemView.findViewById(R.id.txt_postCompany);
            txt_transportDocumentNumber = itemView.findViewById(R.id.txt_transportDocumentNumber);
            txt_date = itemView.findViewById(R.id.txt_date);
        }
    }

    public RecyclerViewAdapter_post(List<Post> post_list){
        this.post_list = post_list;
    }
    @Override
    public RecyclerViewAdapter_post.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //viewholder - 각 뷰를 보관하는 holder 객체, inflate - xml에 표기된 레이아웃들을 메모리에 객체화시키는 행동
        View holderView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.parcel_service, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(holderView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter_post.MyViewHolder holder, int position) {
        //리스트에서 선택한 포지션에 따른 포스트 객체를 받아옴
        Post post = post_list.get(position);
    }

    @Override
    public int getItemCount() {
        return post_list.size();
    }
}
