package com.example.listaenlazada.ListaEnlazada;

public class NodoListaDouble {


        double dato;
        NodoListaDouble enlace;

        public NodoListaDouble(double x) {
            dato = x;
            enlace = null;
        }

        public NodoListaDouble(double x, NodoListaDouble n) {
            dato = x;
            enlace = n;
        }

        public double getDato() {
            return dato;
        }

        public NodoListaDouble getEnlace() {
            return enlace;
        }

        public void setEnlace(NodoListaDouble enlace) {
            this.enlace = enlace;
        }

        public String toString() {
            return String.valueOf(dato);
        }
    }

