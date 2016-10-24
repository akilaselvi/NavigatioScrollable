package com.example.mufsira.audit_ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mufsira on 18/10/16.
 */
public class Signin extends AppCompatActivity {

    EditText editTextUserName, editPassWord;
    Button btnSignIn;
    TextInputLayout text_input_name,text_input_password;
    TextView forgot_pwd;
    final Context c = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        editTextUserName = (EditText) findViewById(R.id.input_name);
        editPassWord = (EditText) findViewById(R.id.input_password);
        btnSignIn = (Button) findViewById(R.id.btn_login);
        forgot_pwd = (TextView)findViewById(R.id.forgot_text);
        text_input_name = (TextInputLayout) findViewById(R.id.name_input_layout);
        text_input_password=(TextInputLayout)findViewById(R.id.password_input_layout);
        text_input_name.setHint("USER NAME");
        text_input_password.setHint("PASSWORD");
        editTextUserName.addTextChangedListener(new MyTextWatcher(editTextUserName));
        editPassWord.addTextChangedListener(new MyTextWatcher(editPassWord));
        forgot_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                View mView = layoutInflaterAndroid.inflate(R.layout.alert, null);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                alertDialogBuilderUserInput.setView(mView);

                final LinearLayout email_layout = (LinearLayout) mView.findViewById(R.id.email_layout);
                final  LinearLayout phone_layout = (LinearLayout) mView.findViewById(R.id.phone_layout);

                email_layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent email = new Intent(Signin.this,ForgotEmail.class);
                        startActivity(email);
                    }
                });

                phone_layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();


            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent chart = new Intent(Signin.this,MainActivity.class);
                startActivity(chart);

            }
        });
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.input_name:
                    if (editTextUserName.getText().length() == 0) {
                        text_input_name.setErrorEnabled(true);
                        text_input_name.setError("Enter name");
                    } else {
                        text_input_name.setErrorEnabled(false);
                    }

                    break;
                case R.id.input_password:
                    if (editPassWord.getText().length() == 0) {
                        text_input_password.setErrorEnabled(true);
                        text_input_password.setError("Enter name");
                    } else {
                        text_input_password.setErrorEnabled(false);
                    }
                break;
            }
        }
    }
}


