package com.example.tvtime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Favoritos extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Favoritos.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
    }

    public void homepage(View view) {
        Homepage.startActivity(this);
    }

    public void favoritos(View view) {
        Favoritos.startActivity(this);
    }

    public void defenicoes(View view) { Definicoes.startActivity(this);}

    public void vistos(View view) { Watched.startActivity(this);}

    public void search(View view) { Search.startActivity(this);}
}
