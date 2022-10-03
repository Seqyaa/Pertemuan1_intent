package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText alas =
                (EditText) findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText) findViewById(R.id.input_tinggi);
        final EditText hasil =
                (EditText) findViewById(R.id.output_hasil);
        final Button tampil =
                (Button) findViewById(R.id.btn_hitung);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas1 = Double.parseDouble(alas.getText().toString());
                double tinggi1 = Double.parseDouble(tinggi.getText().toString());
                double hasil1 = alas1*tinggi1/2;
                hasil.setText(String.valueOf(hasil1));

            }
        })
        ;
    }
}