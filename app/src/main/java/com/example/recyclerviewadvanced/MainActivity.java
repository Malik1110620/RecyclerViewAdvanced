package com.example.recyclerviewadvanced;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    DataAdopter da;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler);
        rv.setAdapter(new DataAdopter(generateData()));
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setHasFixedSize(true);
    }
    public List<Data> generateData(){
        List<Data>datas1 = new ArrayList<>();
      datas1.add(new Data("image","50","25GB",R.drawable.image2));
        datas1.add(new Data("Vedios","20","5GB",R.drawable.vedio));
        datas1.add(new Data("Audios","50","21GB",R.drawable.audio));
        datas1.add(new Data("Map","50","09GB",R.drawable.location));
        datas1.add(new Data("Camera","50","16GB",R.drawable.camera));
        datas1.add(new Data("Documents","50","19GB",R.drawable.documentss));
        datas1.add(new Data("Downloads","50","25GB",R.drawable.download2));
        datas1.add(new Data("File Manager","50","14GB",R.drawable.filemanager));
        datas1.add(new Data("Android","50","13GB",R.drawable.android));
        datas1.add(new Data("Messages","50","11GB",R.drawable.message));
        datas1.add(new Data("Search","50","8GB",R.drawable.search));
        datas1.add(new Data("API","50","21GB",R.drawable.apiicon));
        datas1.add(new Data("Email","50","20GB",R.drawable.email));
        datas1.add(new Data("Library","50","24GB",R.drawable.library));
        datas1.add(new Data("Favourite","50","18GB",R.drawable.heart));
        datas1.add(new Data("image","50","35GB",R.drawable.image2));
        datas1.add(new Data("image","50","15GB",R.drawable.image2));
        datas1.add(new Data("image","50","5GB",R.drawable.image2));
      return datas1;

    }
}

