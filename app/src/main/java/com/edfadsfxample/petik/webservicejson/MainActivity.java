package com.edfadsfxample.petik.webservicejson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView tv1;
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btnJson);

        et1 = (EditText) findViewById(R.id.et_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv1.setText(et1.getText());

            }
        });
    }
}
