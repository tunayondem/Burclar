package com.example.tuna.burclar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Random;

public class CinAstrolojisi extends AppCompatActivity {
    Button button;

    DatePicker datePicker;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cin_astrolojisi);

        button = (Button) findViewById(R.id.button);

        datePicker = (DatePicker) findViewById(R.id.datePicker);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch ((datePicker.getYear())%12  ){
                    case 0:
                        alertDialog("Maymun",R.string.Maymun);
                        break;
                    case 1:
                        alertDialog("Horoz",R.string.Horoz);
                        break;
                    case 2:
                        alertDialog("Köpek",R.string.Köpek);
                        break;
                    case 3 :
                        alertDialog("Domuz",R.string.Domuz);
                        break;
                    case 4:
                        alertDialog("Fare",R.string.Fare);
                        break;
                    case 5:
                        alertDialog("Öküz",R.string.Öküz);
                        break;
                    case 6:
                        alertDialog("Kaplan",R.string.Kaplan);
                        break;
                    case 7:
                        alertDialog("Tavşan",R.string.Tavşan);
                        break;
                    case 8:
                        alertDialog("Ejderha",R.string.Ejderha);
                        break;
                    case 9:
                        alertDialog("Yılan",R.string.Yılan);
                        break;
                    case 10:
                        alertDialog("At",R.string.At);
                        break;
                    case 11:
                        alertDialog("Keçi",R.string.Keçi);
                        break;


                }

            }
        });
        /*
        button_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random myrandom = new Random();

                switch (myrandom.nextInt()  %10){
                    case 0:
                        textView_cin.setText(R.string.cin_yorumu1);
                        break;
                    case 1:
                        textView_cin.setText(R.string.cin_yorumu2);
                        break;
                    case 2:
                        textView_cin.setText(R.string.cin_yorumu3);
                        break;
                    case 3:
                        textView_cin.setText(R.string.cin_yorumu4);
                        break;
                    case 4:
                        textView_cin.setText(R.string.cin_yorumu5);
                    case 5:
                        textView_cin.setText(R.string.cin_yorumu6);
                        break;
                    case 6:
                        textView_cin.setText(R.string.cin_yorumu7);
                        break;
                    case 7:
                        textView_cin.setText(R.string.cin_yorumu8);
                        break;
                    case 8:
                        textView_cin.setText(R.string.cin_yorumu9);
                        break;
                    case 9:
                        textView_cin.setText(R.string.cin_yorumu10);
                }

            }
        });

*/


    }
    public String Date(){
        StringBuilder builder = new StringBuilder();
        builder.append("Seçilen Tarih");
        builder.append(datePicker.getMonth()+1+"/");
        builder.append(datePicker.getDayOfMonth()+"/");
        builder.append(datePicker.getYear());
        return builder.toString();

    }


    public void alertDialog(String title, final int message){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle(title);

        // set dialog message
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Paylaş",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, getString(message));
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);


                    }
                })
                .setNegativeButton("Kapat",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                        //startActivity(new Intent(getApplicationContext(),CinAstrolojisi.class));

                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }

}
