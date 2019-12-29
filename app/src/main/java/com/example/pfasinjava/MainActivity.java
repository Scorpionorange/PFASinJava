package com.example.pfasinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button btnOK = null;
    private EditText etInput = null;
    private TextView tvOutput = null;
    private String strEtInput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = (EditText) findViewById(R.id.etFAInput);
        btnOK = (Button) findViewById(R.id.btnFAOK);
        tvOutput = (TextView) findViewById(R.id.tvFAOutput);
        btnOK.setOnClickListener(new OnClickListener(){

            @Override
            //当按钮按下后：
            public void onClick(View v) {
                //把etInput内输入的值赋给strEtInput;
                strEtInput = etInput.getText().toString();
                //在tvOutput内输出etInput内输入的值;
                tvOutput.setText(strEtInput);
            }
        });
    }
}
