package com.example.sistemas.aplicacionhola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView t1;
    private TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tx1);

    }


    public void mostrar(View view)
    {
        String valor1 = et1.getText().toString();
        t1.setText(getResources().getString(R.string.respuesta) + "  " + valor1);

    }
    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
       /* String v1= et1.getText().toString();
        String s="Hola"+(v1);
        t2.setText(s);*/

    }
}
