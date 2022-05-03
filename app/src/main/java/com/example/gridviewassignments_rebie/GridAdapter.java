package com.example.gridviewassignments_rebie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private final int img[];
    private final  String name[];
    private final String price[];
    Context context;

    public GridAdapter(int[] img, String[] name, String[] price, Context context) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.context = context;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.gridview_item,null);
        ImageView imageView = (ImageView) view1.findViewById(R.id.img1);
        TextView textView1= (TextView) view1.findViewById(R.id.tv1);
        TextView textView2= (TextView) view1.findViewById(R.id.tv2);
        imageView.setImageResource(img[position]);
        textView1.setText(name[position]);
        textView2.setText(price[position]);
        return view1;
    }
}
