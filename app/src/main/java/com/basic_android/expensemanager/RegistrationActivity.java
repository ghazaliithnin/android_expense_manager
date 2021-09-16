package com.basic_android.expensemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    private EditText mEmail;
    private EditText mPass;
    private Button btnReg;
    private TextView mSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Call Registration Method
        registration();

    }

    // Registration Method
    private void registration() {
        mEmail = findViewById(R.id.email_reg);
        mPass = findViewById(R.id.password_reg);
        btnReg = findViewById(R.id.btn_reg);
        mSignin = findViewById(R.id.signin_here);

        // Register Button
        btnReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String email=mEmail.getText().toString().trim();
                String pass =mPass.getText().toString().trim();

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

        // Sign In Activity
        // Sign In when the text "Sign In" is pressed
        mSignin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}