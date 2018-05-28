package com.example.yam35.activ4result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    Button btn;
    String result1;
    TextView TV;
    Intent t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        TV= (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btn1);

        t = getIntent();
        result1= t.getStringExtra("result");

        TV.setText("the Last result is: "+result1);
    }

    public void Click1ret(View view) {
        t.putExtra("res1",result1);
        setResult(RESULT_OK,t);
        finish();
    }
}
