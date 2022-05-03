package com.example.gridviewassignments_rebie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int imges[] ={
            R.drawable.avocdo,
            R.drawable.coffee,
            R.drawable.tea,
            R.drawable.soda,
            R.drawable.orange_juice,
            R.drawable.soup,
            R.drawable.stake,
            R.drawable.kabab,
            R.drawable.piza
    };
    String text[]={"Avocado","Coffee", "Tea","Soda","Orange","Soup","Stake","Kebab","Pizza"};
    String price[] = {"$7.99", "$4.86","$4","$1.99", "$3", "$5","$15", "$12","$14"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        GridAdapter myAdapter = new GridAdapter(imges, text, price,this);
        gridView.setAdapter(myAdapter);

    }
}