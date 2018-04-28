package com.gmail.farasabiyyu12.baltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recy;
    CustomAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Recycler View Method
        recy = findViewById(R.id.recycler_view);
        recy.setLayoutManager(new LinearLayoutManager(this));

        //TODO Set Adapter
        adap = new CustomAdapter();
        recy.setAdapter(adap);
    }

    String[] judul = {"Tanah Lot", "Pantai Kuta", "Pantai Sanur", "Beachwalk", "Monumen Bajra Sandhi",
            "Museum Bali", "Pantai Double Six", "Pura Besakih", "Pura Tirta Empul", "Gunung Agung" };
    int[] gambar = {
            R.drawable.tanahlot,
            R.drawable.pantaikuta,
            R.drawable.pantaisanur,
            R.drawable.beachwalk,
            R.drawable.monumenbajrasandhi,
            R.drawable.museumbali,
            R.drawable.pantaidoublesix,
            R.drawable.purabesakih,
            R.drawable.pura_tirta_empul,
            R.drawable.gunung_agung


    };

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview, null);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {
            holder.judul.setText(judul[position]);
            holder.img.setImageResource(gambar[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), ScrollingActivity.class)
                    .putExtra("judul", judul[position])
                    .putExtra("gambar", gambar[position]));
                }
            });
        }

        @Override
        public int getItemCount() {
            return judul.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView judul;
            ImageView img;

            public MyViewHolder (View itemView){
                super(itemView);

                judul = itemView.findViewById(R.id.txtjudul);
                img = itemView.findViewById(R.id.gambar);
            }
        }

    }
}
