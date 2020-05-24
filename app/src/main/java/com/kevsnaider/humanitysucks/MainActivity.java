package com.kevsnaider.humanitysucks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kevsnaider.humanitysucks.ui.disabled.DisabledActivity;
import com.kevsnaider.humanitysucks.ui.main.AboutActivity;
import com.kevsnaider.humanitysucks.ui.main.RulesActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_priv_room, btn_pub_room, btn_local_game;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_priv_room = findViewById(R.id.btn_priv_room);
        btn_priv_room.setOnClickListener(this);
        btn_pub_room = findViewById(R.id.btn_pub_room);
        btn_pub_room.setOnClickListener(this);
        btn_local_game = findViewById(R.id.btn_local_game);
        btn_local_game.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_priv_room) || v == findViewById(R.id.btn_pub_room)) {
            intent = new Intent(this, DisabledActivity.class);
            startActivity(intent);
        } else if (v == findViewById(R.id.btn_local_game)) {
            intent = new Intent(this, LocalGameActivity.class);
            startActivity(intent);
        }
    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_rules) {
            intent = new Intent(this, RulesActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_about) {
            intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
