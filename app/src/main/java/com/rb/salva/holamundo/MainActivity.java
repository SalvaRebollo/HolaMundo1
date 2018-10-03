package com.rb.salva.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView msg ;
    private Button btn ;
    private int numero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Llamo a onCreate de la clase AppCompatActivity, la cual he puesto con extends en la linea 9
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button) ;

        msg.setText("¡Púlsame!");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero++;
                msg.setText(R.string.textopulsado + " " + numero + " veces.");
            }
        });



    }
}
