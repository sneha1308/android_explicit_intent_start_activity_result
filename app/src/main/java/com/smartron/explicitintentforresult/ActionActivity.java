package com.smartron.explicitintentforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ActionActivity extends AppCompatActivity implements View.OnClickListener {
    public RadioGroup radio_rg;
    RadioButton one_rbtn, two_rbtn;
    Button done_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        radio_rg = findViewById(R.id.radio_rg);

        done_btn = findViewById(R.id.done_btn);
        done_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = radio_rg.getCheckedRadioButtonId();
        Intent i = getIntent();
        i.putExtra("select", id == R.id.one_rbtn ? "one" : "two");
        setResult(RESULT_OK, i);
        finish();
    }
}
