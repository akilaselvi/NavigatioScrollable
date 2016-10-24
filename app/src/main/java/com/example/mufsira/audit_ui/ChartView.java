package com.example.mufsira.audit_ui;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChartView extends Fragment {

    private LinearLayoutManager lLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_dashboard, container, false);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(getActivity());

        RecyclerView rView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), rowListItem);
        rView.setAdapter(rcAdapter);
        return rootView;
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("United States", R.drawable.newyork));
        allItems.add(new ItemObject("Canada", R.drawable.canada));
        allItems.add(new ItemObject("United Kingdom", R.drawable.uk));
        allItems.add(new ItemObject("Germany", R.drawable.germany));
        allItems.add(new ItemObject("Sweden", R.drawable.sweden));

        return allItems;
    }
}
