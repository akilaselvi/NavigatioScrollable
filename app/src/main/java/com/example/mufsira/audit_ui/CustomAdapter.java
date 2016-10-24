package com.example.mufsira.audit_ui;

/**
 * Created by akila on 18/10/16.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int flags[];
    String[] countryNames;
    String[] countryCode;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] flags, String[] countryNames, String[] countryCode) {
        this.context = applicationContext;
        this.flags = flags;
        this.countryNames = countryNames;
        this.countryCode = countryCode;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return flags.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView_country);
        TextView code = (TextView) view.findViewById(R.id.country_code);
        icon.setImageResource(flags[i]);
        code.setText(countryCode[i]);
        return view;
    }
}