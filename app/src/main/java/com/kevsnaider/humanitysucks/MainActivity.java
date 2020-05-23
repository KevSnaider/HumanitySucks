package com.kevsnaider.humanitysucks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.kevsnaider.humanitysucks.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_priv_room, btn_pub_room, btn_local_game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        btn_priv_room = findViewById(R.id.btn_priv_room);
        btn_priv_room.setOnClickListener(this);
        btn_pub_room = findViewById(R.id.btn_pub_room);
        btn_pub_room.setOnClickListener(this);
        btn_local_game = findViewById(R.id.btn_local_game);
        btn_local_game.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_priv_room) || v == findViewById(R.id.btn_priv_room)) {

        } else if (v == findViewById(R.id.btn_local_game)) {

        }
    }
}
