package com.kevsnaider.humanitysucks;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.kevsnaider.humanitysucks.ui.disabled.DisabledActivity;
import com.kevsnaider.humanitysucks.ui.main.LocalGameActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_priv_room, btn_pub_room, btn_local_game;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

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
    }
}
