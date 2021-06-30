package com.udangtangtang.daekbae.controller;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.udangtangtang.daekbae.R;

public class Input_post_dialog {
    private Context context;
    private String[] post_company_list;
    private long seleted_post_company;
    private long input_post_number=0;
    public Input_post_dialog(Context context, String[] post_company_list){
        this.context = context;
        this.post_company_list = post_company_list;
    }

    public long[] callFunction(){
        final Dialog dlg = new Dialog(context);

        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dlg.setContentView(R.layout.input_post_dialog);
        dlg.show();

        final Spinner spi_post_company = dlg.findViewById(R.id.spi_post_company);
        final EditText edt_input_post = dlg.findViewById(R.id.edt_input_post);
        final Button btn_input = dlg.findViewById(R.id.btn_input);
        final Button btn_cancel = dlg.findViewById(R.id.btn_cancel);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                context, android.R.layout.simple_dropdown_item_1line, post_company_list);
        spi_post_company.setAdapter(adapter);

        spi_post_company.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                seleted_post_company = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_post_number = Integer.parseInt(edt_input_post.getText().toString());
                dlg.dismiss();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlg.dismiss();
            }
        });
        return (input_post_number==0) ? new long[] {seleted_post_company, input_post_number} : null;
    }
}
