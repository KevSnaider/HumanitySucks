package com.kevsnaider.humanitysucks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kevsnaider.humanitysucks.ui.localGameModes.CardCzarActivity;
import com.kevsnaider.humanitysucks.ui.localGameModes.CardPlayerActivity;

public class LocalGameActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_card_czar, btn_card_player;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_game);

        btn_card_czar = findViewById(R.id.btn_card_czar);
        btn_card_czar.setOnClickListener(this);
        btn_card_player = findViewById(R.id.btn_card_player);
        btn_card_player.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_card_czar)) {
            intent = new Intent(this, CardCzarActivity.class);
            startActivity(intent);
        } else if (v == findViewById(R.id.btn_card_player)) {
            intent = new Intent(this, CardPlayerActivity.class);
            startActivity(intent);
        }
    }
}
