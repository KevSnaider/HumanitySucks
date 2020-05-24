package com.kevsnaider.humanitysucks.ui.main;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.kevsnaider.humanitysucks.R;

public class AboutActivity extends AppCompatActivity {
    TextView tv_about_us;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tv_about_us = findViewById(R.id.tv_about_us);
        tv_about_us.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
