package com.example.tuna.burclar;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BurcUyumu extends AppCompatActivity {
private ProgressDialog progressDialog;
    private static final int DOLMA_SURESI = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burc_uyumu);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Button hesapla= (Button) findViewById(R.id.burcUyum);


        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.burc_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.burc_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);



        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("tag","btn tiklandi");

                progressDialog = ProgressDialog.show(BurcUyumu.this,"","Burç Uyumunuz Hesaplanıyor");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.v("tag","Dolma süresi");
                        Toast.makeText(getApplicationContext(),"Süre tamamlandı",Toast.LENGTH_SHORT).show();
                    }
                }, DOLMA_SURESI);

            }
        });

    }




}