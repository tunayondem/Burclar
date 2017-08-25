package com.example.tuna.burclar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton burc1, burc2, burc3, burc4, burc5, burc6, burc7, burc8, burc9, burc10, burc11, burc12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        burc1 = (ImageButton) findViewById(R.id.button_burc1);
        burc2 = (ImageButton) findViewById(R.id.button_burc2);
        burc3 = (ImageButton) findViewById(R.id.button_burc3);
        burc4 = (ImageButton) findViewById(R.id.button_burc4);
        burc5 = (ImageButton) findViewById(R.id.button_burc5);
        burc6 = (ImageButton) findViewById(R.id.button_burc6);
        burc7 = (ImageButton) findViewById(R.id.button_burc7);
        burc8 = (ImageButton) findViewById(R.id.button_burc8);
        burc9 = (ImageButton) findViewById(R.id.button_burc9);
        burc10 = (ImageButton) findViewById(R.id.button_burc10);
        burc11 = (ImageButton) findViewById(R.id.button_burc11);
        burc12 = (ImageButton) findViewById(R.id.button_burc12);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_burc_ozellik) {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        } else if (id == R.id.nav_burc_uyum) {

        } else if (id == R.id.nav_cin) {

        } else if (id == R.id.nav_biz) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_puan) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void burc1(View view){
        startActivity(new Intent(getApplicationContext(),KocActivity.class));
    }
    public void burc2(View view){
        startActivity(new Intent(getApplicationContext(),BogaActivity.class));
    }

    public void burc3(View view) {
        startActivity(new Intent(getApplicationContext(),IkizlerActivity.class));
    }

    public void burc4 (View view){
        startActivity(new Intent(getApplicationContext(),YengecActivity.class));
    }

    public void burc5 (View view){
        startActivity(new Intent(getApplicationContext(), AslanActivity.class));
    }

    public void burc6 (View view){
        startActivity(new Intent(getApplicationContext(),BasakActivity.class));
    }

    public void burc7 (View view){
        startActivity(new Intent(getApplicationContext(),TeraziActivity.class));
    }

    public void burc8 (View view){
        startActivity(new Intent(getApplicationContext(),AkrepActivity.class));
    }

    public void burc9 (View view){
        startActivity(new Intent(getApplicationContext(),YayActivity.class));
    }

    public  void burc10 (View view){
        startActivity(new Intent(getApplicationContext(),OglakActivity.class));
    }

    public void burc11(View view){
        startActivity(new Intent(getApplicationContext(),KovaActivity.class));
    }

    public void burc12(View view){
        startActivity(new Intent(getApplicationContext(),BalikActivity.class));
    }


}



