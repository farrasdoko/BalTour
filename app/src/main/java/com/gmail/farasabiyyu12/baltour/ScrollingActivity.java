package com.gmail.farasabiyyu12.baltour;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;

public class ScrollingActivity extends AppCompatActivity {

    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO Intent
        Intent intent = getIntent();

        String strjudul = intent.getStringExtra("judul");
        int strgambar = intent.getIntExtra("gambar", 0);
        //TODO Setting Toolbar
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(strjudul);

        try {
            Glide.with(this).load(strgambar).into((ImageView) findViewById(R.id.gambar));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO setDetail Text
        txtDetail = findViewById(R.id.txtdetail);

        if (strjudul.equals("Tanah Lot")){
            txtDetail.setText(R.string.tanah_lot);
        }else if (strjudul.equals("Pantai Kuta")){
            txtDetail.setText(R.string.pantai_kuta);
        }else if (strjudul.equals("Pantai Sanur")){
            txtDetail.setText(R.string.pantai_sanur);
        }else if (strjudul.equals("Beachwalk")){
            txtDetail.setText(R.string.beachwalk);
        }else if (strjudul.equals("Monumen Bajra Sandhi")){
            txtDetail.setText(R.string.bajra_sandhi);
        }else if (strjudul.equals("Museum Bali")) {
            txtDetail.setText(R.string.museum_bali);
        }else if (strjudul.equals("Pantai Double Six")){
            txtDetail.setText(R.string.pantai_double_six);
        }else if (strjudul.equals("Pura Besakih")){
            txtDetail.setText(R.string.pura_besakih);
        }else if (strjudul.equals("Pura Tirta Empul")) {
            txtDetail.setText(R.string.pura_tirta_empul);
        }else if (strjudul.equals("Gunung Agung")){
            txtDetail.setText(R.string.gunung_agung);
        }
    }
}
