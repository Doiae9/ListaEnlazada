package com.example.listaenlazada.ListaEnlazada;


public class ListaEnlazada {
    private NodoLista primero;
    public ListaEnlazada(){
        primero= null;
    } //Siempre guardamos el primero, os ea el ultimo que guardamos de la lista
    public void ListaEnlazada(){
        primero= null;
    }
    public void crearListaEnlazada(){
        primero= new NodoLista(19); //Cada vez que guardo
        primero= new NodoLista(6,primero);
        primero= new NodoLista(1,primero);
        primero= new NodoLista(2,primero);
        primero= new NodoLista(4,primero);
    }//Big O Constante
    public String toString(){
        String resultado=""; //lo coloca en vacío
                NodoLista aux= primero; //Tomamos un auxiliar para nodo lista como referencia
                while (aux != null){//Ponemos un while en vez de un for para que detecte primero y su enlace null
                    resultado+=aux+"->";//Concatenamos la flecha
                    aux= aux.getEnlace();//Nos da el siguiente nodo al que apunta.
                }
               return resultado;
    }
}
