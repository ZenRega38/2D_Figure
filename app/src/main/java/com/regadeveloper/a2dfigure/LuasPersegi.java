package com.regadeveloper.a2dfigure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegi extends AppCompatActivity {
    private Button btn ;
    private EditText عتةانجانغ,عتلعبار;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);


        btn=findViewById(R.id.btnhtg);
        عتةانجانغ=findViewById(R.id.etpanjangpersegi);
        عتلعبار=findViewById(R.id.etlebarpersegi);
        hasil=findViewById(R.id.tvhasilper);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang= Integer.parseInt(عتةانجانغ.getText().toString());
                Integer lebar=Integer.parseInt(عتلعبار.getText().toString());
                hasil.setText(String.valueOf(panjang*lebar));
            }
        });
    }
}
