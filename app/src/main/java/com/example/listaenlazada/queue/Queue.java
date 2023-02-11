package com.example.listaenlazada.queue;

import android.util.Log;

public class Queue {
    private QueueNode first;
    private QueueNode last;

    public Queue() {
        first = null;
        last = null;

    }
    public void add(int data){
        //Nos enfocamos en el primero que entró el cual será el primero que salga
        //El Big O es lineal, el While lo hace de esta forma.
        //Con una condicional limite de 8 por ejemplo  es constante
        QueueNode node= new QueueNode(data);
        if(node == null){
            Log.i("log","Queue overflow");
        }else{
            if(first== null) {
             first= node;
            } else{
                last.setNext(node);
            }
            last= node;

        }
    }
    public void print(){
        String result ="";
        QueueNode aux= first;
        while(aux != null){
            result+=aux+" -> ";
            aux=aux.getNext();
        }
        Log.i("log",result);
    }

    public int remove(){
        //Big O Constante
    if(first== null){
        return -1;//Empty queue
    }else{
       QueueNode node= first;
       first=first.getNext();
       if(first == null)
           last= null;
       return node.getData();
    }
    }
    public QueueNode getFirst() {
        return first;
    }

    public QueueNode getLast() {
        return last;
    }
}
