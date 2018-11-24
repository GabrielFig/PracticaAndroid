package com.gabo.aplicacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaramos variables
    Button accionar;
    TextView textHola,txtubi,txtape,txtnom;
    //asignamos valores a las cadenas que iran de nuestros TextView's
    String nombre = "Gabriel";
    String ubica = "los mochis";
    String ape = "Figueroa";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignar por la id las variables a sus respectivos TextView's
        accionar = findViewById(R.id.btnaccionar);
        textHola = findViewById(R.id.hola);
        txtnom = findViewById(R.id.txtnom);
        txtape = findViewById(R.id.txtape);
        txtubi = findViewById(R.id.txtubi);

        accionar.setOnClickListener(new View.OnClickListener() {//que va a pasar al tocar el boton
            @Override
            public void onClick(View v) {
                textHola.setText("Adios mundo cruel");//este texto cambiara
                txtnom.setText("Nombre:"+nombre);//aqui se le concatenaran las cadenas que hicimos al principio
                txtubi.setText("Ubicacion:"+ ubica);
                txtape.setText("Apellido:"+ape);
            }
        });
    }
}
