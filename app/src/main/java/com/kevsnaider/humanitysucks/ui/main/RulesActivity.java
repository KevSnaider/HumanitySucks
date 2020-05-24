package com.kevsnaider.humanitysucks.ui.main;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.kevsnaider.humanitysucks.R;

public class RulesActivity extends AppCompatActivity {
    TextView tv_rules;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        tv_rules = findViewById(R.id.tv_rules);
        tv_rules.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
