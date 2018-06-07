package com.example.suncuoglu.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CustomView cs;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = findViewById(R.id.textView);
        cs = findViewById(R.id.customView);

//        cs.setOnCustomListener(new CustomView.OnCustomListener() {
//            @Override
//            public void onButtonClicked(String text) {
//                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
//            }
//        });
        // 2. yol interface kullandık

        cs.getBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(cs.getText());
            }
        });
    }
}
