package com.prayan_it.nari;


import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    FragmentTransaction fragmenttransaction;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.add(R.id.main_container, new Home());
        fragmenttransaction.commit();
        getSupportActionBar().setTitle("হোম");
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);


        actionBarToggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarToggle);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container,new Home());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("হোম");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.reminder:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container, new Remainder());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("রিমাইন্ডার");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.about:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container, new About());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("আমাদের কথা");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                }



                return false;
            }
        });


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarToggle.syncState();
    }
}
