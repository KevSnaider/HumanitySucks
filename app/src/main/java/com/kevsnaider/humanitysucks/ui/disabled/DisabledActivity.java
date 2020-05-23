package com.kevsnaider.humanitysucks.ui.disabled;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.kevsnaider.humanitysucks.*;

public class DisabledActivity extends AppCompatActivity implements View.OnClickListener  {
    Button btn_back;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disabled);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_back)) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
