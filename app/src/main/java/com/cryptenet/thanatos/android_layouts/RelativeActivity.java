package com.cryptenet.thanatos.android_layouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class RelativeActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText etName, etGender, etOccupation, etEmail, etContact, etHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        init();
    }

    private void init() {
        viewBinder();

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    private void viewBinder() {
        toolbar = findViewById(R.id.toolbar);

        etName = findViewById(R.id.et_name);
        etGender = findViewById(R.id.et_gender);
        etOccupation = findViewById(R.id.et_occupation);
        etEmail = findViewById(R.id.et_email);
        etContact = findViewById(R.id.et_contact);
        etHobby = findViewById(R.id.et_hobby);
    }

    public void formSubmitted(View v) {
        String data =
                etName.getText().toString() + "\n"
                        + etGender.getText().toString() + "\n"
                        + etOccupation.getText().toString() + "\n"
                        + etEmail.getText().toString() + "\n"
                        + etContact.getText().toString() + "\n"
                        + etHobby.getText().toString();

        Toast.makeText(RelativeActivity.this, data, Toast.LENGTH_LONG).show();
    }
}
