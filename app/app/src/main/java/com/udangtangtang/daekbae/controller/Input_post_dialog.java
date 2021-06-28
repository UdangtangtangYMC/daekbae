package com.udangtangtang.daekbae.controller;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.udangtangtang.daekbae.R;

public class Input_post_dialog {
    private Context context;

    public Input_post_dialog(Context context){
        this.context = context;
    }

    public void callFunction(){
        final Dialog dlg = new Dialog(context);

        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dlg.setContentView(R.layout.input_post_dialog);
        dlg.show();

        final Spinner spi_post_company = dlg.findViewById(R.id.spi_post_company);
        final EditText edt_input_post = dlg.findViewById(R.id.edt_input_post);
        final Button btn_input = dlg.findViewById(R.id.btn_input);
        final Button btn_cancel = dlg.findViewById(R.id.btn_cancel);

        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlg.dismiss();;
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlg.dismiss();
            }
        });
    }
}
