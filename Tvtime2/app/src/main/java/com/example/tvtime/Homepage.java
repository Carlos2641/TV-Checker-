package com.example.tvtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {




    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Homepage.class);
        context.startActivity(intent);
    }

    GridView gridView;
    String[] numberWord ={"One","Two","Three","Four"};
    int[] numberImage={R.drawable.blacklist,R.drawable.suits,R.drawable.gravityfalls,R.drawable.vikings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        gridView= findViewById(R.id.grid_view);

        HomeAdapter adapter = new HomeAdapter (Homepage.this, numberWord, numberImage);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
                    public void onItemClick(AdapterView<?> parent, View view, int positon, long id) {
                Toast.makeText(getApplicationContext(),"You touched this screen omg!"+numberWord[+positon],Toast.LENGTH_SHORT).show();
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

    public void search(View view) { Search.startActivity(this);}
}
