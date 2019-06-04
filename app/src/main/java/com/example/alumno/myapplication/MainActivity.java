package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a oncreate ");
        btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent y = new Intent( MainActivity.this,
                        DetalleActivity.class);
                MainActivity.this.startActivity(y);

            }
        }};

    }

    protected void onStart() {
        super.onStart();
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a onStart ");

    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this,
                "Gracias por usar", Toast.LENGTH_SHORT).show();
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a onPause ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a onStop ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("alvarito",
                "la aplicacion acaba de ingresar a onDestroy ");

    }
}