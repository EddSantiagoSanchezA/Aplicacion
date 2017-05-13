package com.example.eddysantiago.aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Crear variables de los objetos a utilizar
    Button miboton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia a estos elementos
        miboton = (Button) findViewById(R.id.boton1);

        //Agregar un listener
        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla=new Intent(MainActivity.this,Segunda.class);
                startActivity(pantalla);
                finish();
            }
        });
    }
}
