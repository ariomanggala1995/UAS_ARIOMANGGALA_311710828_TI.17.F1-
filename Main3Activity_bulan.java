package com.example.uas_nurul_misbahudin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity_bulan extends AppCompatActivity {


    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namamasjid = new ArrayList<>();
    private ArrayList<String> namakota = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_bulan);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(foto, namamasjid,namakota, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namakota.add("Bulan Muaram");
        namamasjid.add("Bulan Muaram");
        foto.add("https://lh6.googleusercontent.com/proxy/yV4Cl2n36-XY59tLqKIH06WE7d93U5TIaBjTofuOvfNyIJ2v2r4vJ9KGut3GO76McipQz7kQC5-RKOXvcklfRXzLKcwvdQwNiLQF=s0-d");
        info.add("1.\tTahun Baru Islam 1442 H 1 Muharam 1442 H    20 Agustus 2020\n" +
                "2.\tPuasa Tasu’a 1442 H 9 Muharam 1442 H   28 Agustus 2020\n" +
                "3.\tPuasa 'Asyura 1442 H    10 Muharam 1442 H  29 Agustus 2020\n" +
                "4.\tPuasa Ayyamul Bidh Muharam 1442 H   13 - 15 Muharam 1442 H 01 - 03 September 2020\n");

        namakota.add("Bulan Sya'ban");
        namamasjid.add("Bulan Sya'ban");
        foto.add("https://lh6.googleusercontent.com/proxy/yV4Cl2n36-XY59tLqKIH06WE7d93U5TIaBjTofuOvfNyIJ2v2r4vJ9KGut3GO76McipQz7kQC5-RKOXvcklfRXzLKcwvdQwNiLQF=s0-d");
        info.add("1.\tAwal Bulan Sya'ban (1 Sya'ban 1441 H/ 26 Maret 2020).\n" +
                "2.\tPuasa Ayyamul Bidh Sya'ban (13-15 Sya'bam 1441 H/ 7-9 April 2020).\n" +
                "3.\tNishfu Sya'ban (5 Sya'ban 1441 H/ 09 April 2020).\n");

        namakota.add("Bulan Dzulqaidah");
        namamasjid.add("Dzulqaidah");
        foto.add("https://lh6.googleusercontent.com/proxy/yV4Cl2n36-XY59tLqKIH06WE7d93U5TIaBjTofuOvfNyIJ2v2r4vJ9KGut3GO76McipQz7kQC5-RKOXvcklfRXzLKcwvdQwNiLQF=s0-d");
        info.add("1.\tAwal Bulan Dzulqaidah ( 1 Dzulqaidah 1441 H / 22 Juni 2020)\n" +
                "2.\tPuasa Ayyamul Bidh Dzulqaidah (13 - 15 Dzulqaidah 1441 H /4 - 6 Juli 2020)\n" +
                "3.\tAwal Bulan Dzulhijah ( 1 Dzulhijah 1441 H / 22 Juli 2020)\n" +
                "4.\tHari Awal Dzulhijah ( 1 - 10 Dzulhijah 1441 H /22 - 31 Juli 2020)\n");










        prosesRecyclerViewAdapter();

    }
}