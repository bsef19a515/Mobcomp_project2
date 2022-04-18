package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
//        button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                textView.setText("the text is changed");
//            }
        //});


          }

    public void WriteText(View view) {
        textView.setText("The text is changed for another method");
    }
}