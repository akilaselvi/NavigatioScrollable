package com.example.mufsira.audit_ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mufsira on 19/10/16.
 */
public class ForgotEmail extends AppCompatActivity {
    EditText emailforgot;
    TextInputLayout text_forgot_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_email);
        emailforgot = (EditText) findViewById(R.id.input_email);
        text_forgot_email = (TextInputLayout) findViewById(R.id.email_input_layout);
        text_forgot_email.setHint("EMAIL");


    }
}
