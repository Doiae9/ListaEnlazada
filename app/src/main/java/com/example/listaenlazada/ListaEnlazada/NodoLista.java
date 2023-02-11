package com.example.listaenlazada.ListaEnlazada;

public class NodoLista {

        int dato;
        NodoLista enlace;
public NodoLista(int x)    //Esto es cuando solo tienes un elemento de la lsita
        {
            dato = x;
            enlace = null;
        }

public NodoLista(int x, NodoLista n) //Esto es cuando ya tienes mas de dos datos en la lista enlazada
        {
            dato = x;
            enlace = n;
        }
        public int getDato()
        {
            return dato;
        }
        public NodoLista getEnlace()
        {
            return enlace;
        }
        public void setEnlace(NodoLista enlace)
        {
            this.enlace = enlace;
        }
        public String toString(){//Todas las clases tienen un tostring que añade el idk
    return String.valueOf(dato);//sin estos datos solo imprimiria el valor de la memoria en donde se guarda.
        }
    }

