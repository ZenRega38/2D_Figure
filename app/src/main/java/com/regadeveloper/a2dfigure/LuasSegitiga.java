package com.regadeveloper.a2dfigure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitiga extends AppCompatActivity {
    private Button btnhtg;
    private EditText etalas,ettinggi;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        btnhtg=findViewById(R.id.btnhtgseg);
        etalas=findViewById(R.id.etalas);
        tvhasil=findViewById(R.id.tvhasilseg);
        ettinggi=findViewById(R.id.etpanjangsegitiga);
        btnhtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer alas=Integer.parseInt(etalas.getText().toString());
                Integer tinggi=Integer.parseInt(ettinggi.getText().toString());
                tvhasil.setText(String.valueOf(1/2*alas*tinggi));
            }
        });
    }
}
