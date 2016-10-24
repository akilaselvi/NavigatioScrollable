package com.example.mufsira.audit_ui;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by mufsira on 20/10/16.
 */
public class Signup  extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    public EditText user_name,user_psw, user_mail, user_cmpy,user_domain,user_no;
    public TextInputLayout txt_user_name, txt_user_psw, txt_user_mail, txt_user_cmpy,txt_user_domain, txt_user_no;
    public Spinner spin;

    String[] countryNames={"India","China","Australia","Portugle","America","New Zealand"};
    String[] countryCode={"+91","+1","+141","+47","+54"};
    int flags[] = {R.drawable.india_icons, R.drawable.armenia_icon, R.drawable.american_samoa,R.drawable.benin_icon,R.drawable.bangladesh_icon};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        user_name = (EditText) findViewById(R.id.input_name);
        user_psw = (EditText) findViewById(R.id.input_psw);
        user_mail = (EditText) findViewById(R.id.input_email);
        user_cmpy = (EditText) findViewById(R.id.input_company);
        user_domain = (EditText) findViewById(R.id.input_domain);
        user_no = (EditText) findViewById(R.id.input_phon);
        txt_user_name = (TextInputLayout) findViewById(R.id.username_text_input_layout);
        txt_user_psw = (TextInputLayout) findViewById(R.id.userpsw_text_input_layout);
        txt_user_mail = (TextInputLayout) findViewById(R.id.usermail_text_input_layout);
        txt_user_cmpy = (TextInputLayout) findViewById(R.id.cmpyname_text_input_layout);
        txt_user_domain = (TextInputLayout) findViewById(R.id.domainname_text_input_layout);
        txt_user_no = (TextInputLayout) findViewById(R.id.phone_text_input_layout);
        spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);
        user_name.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        user_psw.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        user_mail.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        user_cmpy.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        user_domain.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        user_no.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        txt_user_name.setHint("User Name");
        txt_user_psw.setHint("Password");
        txt_user_mail.setHint("Email");
        txt_user_cmpy.setHint("Company Name");
        txt_user_domain.setHint("Domain");
        txt_user_no.setHint("Phone Number");
        user_name.addTextChangedListener(new MyTextWatcher(user_name));
        user_psw.addTextChangedListener(new MyTextWatcher(user_psw));
        user_mail.addTextChangedListener(new MyTextWatcher(user_mail));
        user_cmpy.addTextChangedListener(new MyTextWatcher(user_cmpy));
        user_domain.addTextChangedListener(new MyTextWatcher(user_domain));
        user_no.addTextChangedListener(new MyTextWatcher(user_no));



        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countryNames,countryCode);
        spin.setAdapter(customAdapter);

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
                    if (user_name.getText().length() == 0) {
                        txt_user_name.setErrorEnabled(true);
                        txt_user_name.setError("Enter Name");
                    } else {
                        txt_user_name.setErrorEnabled(false);
                    }

                    break;
                case R.id.input_psw:
                    if (user_psw.getText().length() == 0) {
                        txt_user_psw.setErrorEnabled(true);
                        txt_user_psw.setError("Enter Password");
                    } else {
                        txt_user_psw.setErrorEnabled(false);
                    }
                    break;
                case R.id.input_email:
                    if(user_mail.getText().length()==0){
                        txt_user_mail.setErrorEnabled(true);
                        txt_user_mail.setError("Enter Mail");
                    }
                    else{
                        txt_user_mail.setErrorEnabled(false);
                    }
                    break;
                case R.id.input_company:
                    if(user_cmpy.getText().length()==0){
                        txt_user_cmpy.setErrorEnabled(true);
                        txt_user_cmpy.setError("Enter Company Name");
                    }
                    else{
                        txt_user_cmpy.setErrorEnabled(false);
                    }
                    break;
                case R.id.input_domain:
                    if(user_domain.getText().length()==0){
                        txt_user_domain.setError("Enter Domain Name");
                        txt_user_domain.setErrorEnabled(true);
                    }
                    else {
                        txt_user_domain.setErrorEnabled(false);
                    }
                    break;
                case R.id.input_phon:
                    if(user_no.getText().length()==0){
                        txt_user_no.setError("Enter Phone Number");
                        txt_user_no.setErrorEnabled(true);
                    }
                    else{
                        txt_user_no.setErrorEnabled(false);
                    }
                    break;
            }
        }
    }



    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {


//        Toast.makeText(getApplicationContext(), countryCode[position],  Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
