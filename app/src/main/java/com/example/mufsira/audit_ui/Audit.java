package com.example.mufsira.audit_ui;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Audit extends Fragment{

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 8 ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_layout,null);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return view;

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new OneFragment();
                case 1 : return new OneFragment();
                case 2 : return new OneFragment();
                case 3 : return new OneFragment();
                case 4 : return new OneFragment();
                case 5 : return new OneFragment();
                case 6 : return new OneFragment();
                case 7 : return new OneFragment();

            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "Primary";
                case 1 :
                    return "Social";
                case 2 :
                    return "Updates";
                case 3 :
                    return "Primary";
                case 4 :
                    return "Social";
                case 5 :
                    return "Updates";
                case 6 :
                    return "Primary";
                case 7 :
                    return "Social";
            }
            return null;
        }
    }


}