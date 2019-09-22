package com.haritsdeveloper.belajarinten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    Button tombolIntentBiasa, tombolkedua, tombolketiga, tombolkeempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sambungkan tombol yang ada di layout dengan java
        tombolIntentBiasa = findViewById(R.id.btn_intenbiasa);
        tombolkedua = findViewById(R.id.btn_inten2);
        tombolketiga = findViewById(R.id.btn_inten3);
        tombolkeempat = findViewById(R.id.btn_inten4);



        tombolIntentBiasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO : Membuat Intent Biasa
                startActivity(new Intent(MainActivity.this,IntentBiasaActivity.class));
            }
        });

        tombolkedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KeduaActivity.class));
            }
        });

        tombolketiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KetigaActivity.class));
            }
        });

        tombolkeempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,keempatActivity.class));
            }
        });
    }
}
