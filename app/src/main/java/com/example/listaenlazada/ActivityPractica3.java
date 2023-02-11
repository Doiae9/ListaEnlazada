package com.example.listaenlazada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listaenlazada.ListaEnlazada.NodoListaDouble;

public class ActivityPractica3 extends AppCompatActivity {

    private EditText etIngresar;
    private Button bGuardar, bBuscar;
    private ListView lvLista;
    private NodoListaDouble primero= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica2);

        etIngresar = findViewById(R.id.etIngresar);
        bGuardar = findViewById(R.id.bGuardar);
        bBuscar = findViewById(R.id.bBuscar);


        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = etIngresar.getText().toString().trim();
                if (input.equals("") == true) {
                    Toast.makeText(getApplicationContext(), "ingresar sueldo", Toast.LENGTH_LONG).show();
                } else {
                    //double auxInput= Double.parseDouble(input), n);
                    // auxInput, primero);
                    primero = new NodoListaDouble(Double.parseDouble(input), primero);
                    String resultado = "";
                    NodoListaDouble auxPri = primero;
                    double suma = 0;
                    int totalSueldos = 0;
                    while (auxPri != null) {
                        suma += auxPri.getDato();
                        resultado += auxPri + "->";
                        auxPri = auxPri.getEnlace();
                        totalSueldos = totalSueldos + 1;
                    }
                    Log.i("log", "El total de sueldos es " + suma);
                    Log.i("log", "El promedio de sueldos es " + suma / totalSueldos);
                    Log.i("log", "Existen " + totalSueldos + " sueldos registrados");
                }
            }

        });

        bBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = etIngresar.getText().toString().trim();
                if (input.equals("") == true) {
                    Toast.makeText(getApplicationContext(), "Ingrese un número para buscar", Toast.LENGTH_LONG).show();
                } else {
                    double aux = Double.parseDouble(input);
                    int TotalDatos = 0;
                    int posicion = -1;
                    NodoListaDouble auxPri = primero;
                    while (auxPri != null) {
                        auxPri = auxPri.getEnlace();
                        TotalDatos++;
                        if (aux == auxPri.getDato()) {
                            posicion = TotalDatos;

                            break;
                        }
                        auxPri = auxPri.getEnlace();
                        if (posicion == -1) {
                            Toast.makeText(getApplicationContext(), "No se encontró el sueldo", Toast.LENGTH_LONG).show();
                        } else{
                            if (TotalDatos % 2 == 0) {
                                Toast.makeText(getApplicationContext(), "Se encontró el sueldo en la posición"+TotalDatos+"Es par", Toast.LENGTH_LONG).show();
                                Log.i("log", "Su dato es una posición par" + TotalDatos);

                            } else {
                                Toast.makeText(getApplicationContext(), "El número no es par", Toast.LENGTH_LONG).show();
                            Toast.makeText(getApplicationContext(), "Se encontró el sueldo en la posición"+TotalDatos, Toast.LENGTH_LONG).show();
                            Log.i("log", "Su dato se encuentra en: " + TotalDatos);
                    }}

                    }
                }
            }

        });

    }}