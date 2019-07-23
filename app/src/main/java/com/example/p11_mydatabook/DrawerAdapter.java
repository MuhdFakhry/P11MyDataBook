package com.example.p11_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DrawerAdapter extends ArrayAdapter<Drawer> {

    private ArrayList<Drawer> tab;
    private Context context;
    private ImageView ivIcon;
    private TextView tvTab;

    public DrawerAdapter(Context context, int resource, ArrayList<Drawer> objects) {
        super(context, resource, objects);
        tab = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_drawer, parent, false);

        ivIcon = rowView.findViewById(R.id.ivIcon);
        tvTab = rowView.findViewById(R.id.tvTab);

        final Drawer getDrawerRow = tab.get(position);

        tvTab.setText(getDrawerRow.getTab());


        switch (getDrawerRow.getIcon()) {
            case "Bio":
                ivIcon.setImageResource(R.drawable.bio);
                break;
            case "Vaccination":
                ivIcon.setImageResource(R.drawable.vaccination);
                break;
            case "Anniversary":
                ivIcon.setImageResource(R.drawable.anniversary);
                break;
            case "About Us":
                ivIcon.setImageResource(R.drawable.about);
                break;
        }

        return rowView;
    }
}
