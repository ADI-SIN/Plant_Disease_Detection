package com.example.arushi.plant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Newsfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newsfeed);

        TextView tv = (TextView) findViewById(R.id.tv4);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:

                        Intent h= new Intent(Newsfeed.this, MainActivity.class);

                        // Start the new activity
                        startActivity(h);
                        finish();

                        break;

                    case R.id.navigation_dashboard:

                        Intent d= new Intent(Newsfeed.this, Dashboard.class);

                        // Start the new activity
                        startActivity(d);

                        finish();
                        break;

                    case R.id.navigation_notifications:

                        break;
                }
                return false;
            }
        });
    }
}
