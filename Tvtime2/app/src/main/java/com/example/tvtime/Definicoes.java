package com.example.tvtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class Definicoes extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Definicoes.class);
        context.startActivity(intent);
    }

    ListView defenicoeslist;

    String[] items = {"Convidar Amigos","Ajuda","Idioma","Sobre","Notificções","Segurança","Conta","Sair"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicoes);

        defenicoeslist=(ListView) findViewById(R.id.defenicoeslist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);

        defenicoeslist.setAdapter(adapter);

        defenicoeslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }


    public void homepage(View view) {
        Homepage.startActivity(this);
    }

    public void favoritos(View view) {
        Favoritos.startActivity(this);
    }

    public void defenicoes(View view) { Definicoes.startActivity(this);}

    public void vistos(View view) { Watched.startActivity(this);}
}
