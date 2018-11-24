package com.example.cwoollett.homework22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer count =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button countButton = findViewById(R.id.countButton);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("savedCounter",0);
            TextView counterView = findViewById(R.id.countView);
            String stringCount =  Integer.toString(count);
            counterView.setText(stringCount);
        }

        countButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    count++;
            TextView counterView = findViewById(R.id.countView);
            String stringCount =  Integer.toString(count);
            counterView.setText(stringCount);
        }
    } );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("savedCounter",count);
    }
}
