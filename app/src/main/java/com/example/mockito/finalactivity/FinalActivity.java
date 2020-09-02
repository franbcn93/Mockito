package com.example.mockito.finalactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mockito.R;

public class FinalActivity extends AppCompatActivity {

    private TextView textView;
    private String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        textView = (TextView)findViewById(R.id.resPassw);
        Bundle inputData = getIntent().getExtras();

        if(inputData==null){
            textView.setText("");
        }else{
            input = inputData.getString("input");
            textView.setText(input);
        }
    }
}