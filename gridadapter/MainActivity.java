package com.example.gridviewarrayadapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    String[] gridViewString = { "IMG 1", "IMG 2", "IMG 3", "IMG 4", "IMG 5"};
    public int imgarray[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};
//    ImageAdapter imageAdapter = new ImageAdapter(this, R.layout.lview,gridViewString,imgarray);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = findViewById(R.id.gridview);
        ImageAdapter imageAdapter = new ImageAdapter(this, R.layout.lview,gridViewString,imgarray);
        gv.setAdapter(imageAdapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder bldr;
                bldr = new AlertDialog.Builder(MainActivity.this);
                bldr.setTitle("Title");
                AlertDialog alrt = bldr.create();
                alrt.setMessage(gridViewString[position]);
                alrt.show();
            }
        });
    }
}