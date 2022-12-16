package com.example.tourguidewithnavigation.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.tourguidewithnavigation.Fragments.BeachesFragment;
import com.example.tourguidewithnavigation.Fragments.MonumentsFragment;
import com.example.tourguidewithnavigation.Fragments.PlacesFragment;
import com.example.tourguidewithnavigation.Fragments.RestaurantsFragment;
import com.example.tourguidewithnavigation.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout ;
    int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navView);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        loadFrag(new MonumentsFragment(),true);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if(itemId == R.id.monuments){
                loadFrag(new MonumentsFragment(),true);
            }else if(itemId == R.id.places){
                loadFrag(new PlacesFragment(),false);
            }else if (itemId == R.id.beaches){
                loadFrag(new BeachesFragment(),false);
            }else{
                loadFrag(new RestaurantsFragment(),false);
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            count++;
            if(count >1){
                super.onBackPressed();
            }else {
                Toast.makeText(this, "Press back again to exit!", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(() -> count = 1,2000);
            }

        }
    }
    private void loadFrag(Fragment fm , boolean flag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        if(flag){
            ft.add(R.id.frame,fm);
        }else{
            ft.replace(R.id.frame,fm);
        }
        ft.commit();
    }
}