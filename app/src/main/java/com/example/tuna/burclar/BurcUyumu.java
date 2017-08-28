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
    final Context context = this;
    private static final int DOLMA_SURESI = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burc_uyumu);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Button hesapla= (Button) findViewById(R.id.burcUyum);

        final ImageView uyum1= (ImageView) findViewById(R.id.uyum1);
        final ImageView uyum2 = (ImageView) findViewById(R.id.uyum2);

        uyum1.setImageResource(R.mipmap.burc_koc);
        uyum2.setImageResource(R.mipmap.burc_koc);

        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.burc_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.burc_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            int position = spinner.getSelectedItemPosition();
                switch (position){
                    case 0:
                        uyum1.setImageResource(R.mipmap.burc_koc);
                        break;
                    case 1:
                        uyum1.setImageResource(R.mipmap.burc_boga);
                        break;
                    case 2:
                        uyum1.setImageResource(R.mipmap.burc_ikizler);
                        break;
                    case 3:
                        uyum1.setImageResource(R.mipmap.burc_yengec);
                        break;
                    case 4:
                        uyum1.setImageResource(R.mipmap.burc_aslan);
                        break;
                    case 5:
                        uyum1.setImageResource(R.mipmap.burc_basak);
                        break;
                    case 6:
                        uyum1.setImageResource(R.mipmap.burc_terazi);
                        break;
                    case 7:
                        uyum1.setImageResource(R.mipmap.burc_akrep);
                        break;
                    case 8:
                        uyum1.setImageResource(R.mipmap.burc_yay);
                        break;
                    case 9:
                        uyum1.setImageResource(R.mipmap.burc_oglak);
                        break;
                    case 10:
                        uyum1.setImageResource(R.mipmap.burc_kova);
                        break;
                    case 11:
                        uyum1.setImageResource(R.mipmap.burc_balik);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


    });




        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                int position2 = spinner2.getSelectedItemPosition();
                switch (position2){
                    case 0:
                        uyum2.setImageResource(R.mipmap.burc_koc);
                        break;
                    case 1:
                        uyum2.setImageResource(R.mipmap.burc_boga);
                        break;
                    case 2:
                        uyum2.setImageResource(R.mipmap.burc_ikizler);
                        break;
                    case 3:
                        uyum2.setImageResource(R.mipmap.burc_yengec);
                        break;
                    case 4:
                        uyum2.setImageResource(R.mipmap.burc_aslan);
                        break;
                    case 5:
                        uyum2.setImageResource(R.mipmap.burc_basak);
                        break;
                    case 6:
                        uyum2.setImageResource(R.mipmap.burc_terazi);
                        break;
                    case 7:
                        uyum2.setImageResource(R.mipmap.burc_akrep);
                        break;
                    case 8:
                        uyum2.setImageResource(R.mipmap.burc_yay);
                        break;
                    case 9:
                        uyum2.setImageResource(R.mipmap.burc_oglak);
                        break;
                    case 10:
                        uyum2.setImageResource(R.mipmap.burc_kova);
                        break;
                    case 11:
                        uyum2.setImageResource(R.mipmap.burc_balik);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("tag","btn tiklandi");

                progressDialog = ProgressDialog.show(BurcUyumu.this,"","Burç Uyumunuz Hesaplanıyor");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.v("tag","Dolma süresi");
                        alertDialog();
                    }
                }, DOLMA_SURESI);

            }
        });






}



    public void alertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Burç Uyumunuz");

        // set dialog message
        alertDialogBuilder
                .setMessage(R.string.burc_uyumu1)
                .setCancelable(false)
                .setPositiveButton("Paylaş",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.burc_uyumu1));
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);


                    }
                })
                .setNegativeButton("Kapat",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                        startActivity(new Intent(getApplicationContext(),BurcUyumu.class));

                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}