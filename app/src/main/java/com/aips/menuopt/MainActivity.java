package com.aips.menuopt;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_activity,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.profile:
                Toast.makeText(this, "Youi have clicked Profile Option", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                 Toast.makeText(this, "You have clicked Share option", Toast.LENGTH_SHORT).show();
                 return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}