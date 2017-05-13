package com.example.eddysantiago.aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Segunda extends AppCompatActivity {

    //Creamos la variable
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        boton2=(Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla=new Intent(Segunda.this,MainActivity.class);
                startActivity(pantalla);
                finish();
            }
        });
    }
}
