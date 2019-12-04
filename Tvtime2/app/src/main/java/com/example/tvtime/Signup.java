package com.example.tvtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    private EditText editTextusername;
    private EditText editTextemail;
    private EditText editTextpassword;
    private EditText editTextnacionalidade;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Signup.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        this.editTextusername =findViewById(R.id.username);
        this.editTextemail = findViewById(R.id.email);
        this.editTextpassword = findViewById(R.id.password);
        this.editTextnacionalidade = findViewById(R.id.nacionalidade);
    }

    public void SignUp(View view) {

        String username = this.editTextusername.getText().toString();
        String email = this.editTextemail.getText().toString();
        String password = this.editTextpassword.getText().toString();
        String nacionalidade = this.editTextnacionalidade.getText().toString();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || nacionalidade.isEmpty()) {

            Context context = getApplicationContext();
            CharSequence text = "Tem de preencher os campos todos!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


            Log.i("SignUpActivity", "Tem de preencher os campos todos");
            return;
        }



        MainActivity.startActivity(this);
        finish();
    }
}
