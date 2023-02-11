package com.example.listaenlazada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.listaenlazada.queue.Queue;

public class QueueActivity extends AppCompatActivity {

    private Queue queue;
private EditText etIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
        queue = new Queue();
        queue.add(4);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(9);
        queue.add(12);
       Log.i( "log","First -> "+queue.getFirst()+" ");
       Log.i( "log","Last -> "+queue.getLast()+" ");
        Log.i( "log",queue.remove()+" ");
        queue.print();
    }

}