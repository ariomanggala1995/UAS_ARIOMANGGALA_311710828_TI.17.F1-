package com.example.uas_nurul_misbahudin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageview;
    TextView namamasjid1, info1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageview = findViewById(R.id.imageviewfoto);
        namamasjid1 = findViewById(R.id.nama);
        info1 = findViewById(R.id.info);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto") && getIntent().hasExtra("nama_masjid") && getIntent().hasExtra("info")){

            String foto = getIntent().getStringExtra("foto");
            String namamasjid = getIntent().getStringExtra("nama_masjid");
            String info = getIntent().getStringExtra("info");

            setDataActivity(foto, namamasjid, info);

        }
    }

    private void setDataActivity(String foto, String namamasjid, String info){


        Glide.with(this).asBitmap().load(foto).into(imageview);
        namamasjid1.setText(namamasjid);
        info1.setText(info);







    }

}
