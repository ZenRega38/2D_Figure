package com.regadeveloper.a2dfigure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaran extends AppCompatActivity {
    private EditText etjari;
    private Button btnhtg;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        etjari=findViewById(R.id.etjari);
        tvhasil=findViewById(R.id.tvhasil);
        btnhtg=findViewById(R.id.btnhtg);
        btnhtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer jari=Integer.parseInt(etjari.getText().toString());
                tvhasil.setText(String.valueOf(22/7*jari));
            }
        });
    }
}
