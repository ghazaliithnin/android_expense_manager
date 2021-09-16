package com.basic_android.expensemanager;


// Tutorial from @beingknow  youtube, Expense Manager App


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private EditText mEmail;
    private EditText mPass;
    private Button btnLogin;
    private TextView mForgetPassword;
    private TextView mSignupHere;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call Login Details Method
        loginDetails();
    }

    // Login Details Method
    private void loginDetails()
    {
        mEmail=findViewById(R.id.email_login);
        mPass=findViewById(R.id.password_login);
        btnLogin=findViewById(R.id.btn_login);
        mForgetPassword=findViewById(R.id.forget_password);
        mSignupHere=findViewById(R.id.sign_up);

        // Login Button
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String email = mEmail.getText().toString().trim();
                String pass = mPass.getText().toString().trim();

                // If the user did not put email address, notify them to enter email
                if(TextUtils.isEmpty(email))
                {
                    mEmail.setError("Please enter Email");
                    return;
                }

                // If the user did not put email address, notify them to enter email
                if(TextUtils.isEmpty(pass))
                {
                    mPass.setError("Please enter Password");
                    return;
                }
            }
        });

        // Registration Activity
        // Sign Up when the text "Sign Up" is clicked
        mSignupHere.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), RegistrationActivity.class));
            }
        });

        // Reset Password activity
        // Resets Password when the text "Reset Password" is clicked
        mForgetPassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ResetActivity.class));
            }
        });
    }
}