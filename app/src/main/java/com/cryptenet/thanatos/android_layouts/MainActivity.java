package com.cryptenet.thanatos.android_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Toolbar toolbar;
    private Button btnToLinear, btnToRelative, btnToComposite, btnToConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        viewBinder();

        setSupportActionBar(toolbar);

        btnToLinear.setOnClickListener(this);
        btnToRelative.setOnClickListener(this);
        btnToComposite.setOnClickListener(this);
        btnToConstraint.setOnClickListener(this);
    }

    private void viewBinder() {
        toolbar = findViewById(R.id.toolbar);

        btnToLinear = findViewById(R.id.btn_to_linear);
        btnToRelative = findViewById(R.id.btn_to_relative);
        btnToComposite = findViewById(R.id.btn_to_composite);
        btnToConstraint = findViewById(R.id.btn_to_constraint);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_to_linear:
                intent = new Intent(MainActivity.this, LinearActivity.class);
                break;
            case R.id.btn_to_relative:
                intent = new Intent(MainActivity.this, RelativeActivity.class);
                break;
            case R.id.btn_to_composite:
                intent = new Intent(MainActivity.this, CompositeActivity.class);
                break;
            case R.id.btn_to_constraint:
                intent = new Intent(MainActivity.this, LinearLayout.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
