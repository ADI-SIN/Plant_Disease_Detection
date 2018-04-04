package com.example.arushi.plant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        TextView tv = (TextView) findViewById(R.id.tv2);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:

                        Intent h = new Intent(Dashboard.this, MainActivity.class);

                        // Start the new activity
                        startActivity(h);

                        finish();
                        break;

                    case R.id.navigation_dashboard:

                        break;

                    case R.id.navigation_notifications:

                        Intent n = new Intent(Dashboard.this, Newsfeed.class);

                        // Start the new activity
                        startActivity(n);
                        finish();
                        break;
                }
                return false;
            }
        });

    }

}

