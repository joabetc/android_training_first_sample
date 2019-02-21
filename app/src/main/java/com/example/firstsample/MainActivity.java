package com.example.firstsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtPassword;
    private EditText edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUser.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Type your login!",
                            Toast.LENGTH_SHORT).show();
                } else if ("123".equals(edtPassword.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "You're logged in!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
