/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Arbol {
    NodoArbol raiz;
    
    public Arbol() {
        raiz=null;
    }
    
    public void InsertarCli(){
        Clientes newcliente = new Clientes();
        newcliente.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la identificacion:")));
        newcliente.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
        newcliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad:")));
        newcliente.setMembresia(JOptionPane.showInputDialog(null, "Digite SI en caso de contar con membresia, caso contrario digite NO"));
        newcliente.setFechaReserva(JOptionPane.showInputDialog(null, "Digite la fecha de reserva:"));
        raiz = InsertarR(raiz, newcliente);
    }
    
    private NodoArbol InsertarR(NodoArbol nodo, Clientes cli){
        //Validar si el árbol está vacío
        if(nodo == null){
            nodo = new NodoArbol(cli);
            return nodo;
        }
        
        //Si el valor es menor al valor del nodo, se inserta a la izquierda
        if(cli.getEdad() < nodo.cliente.getEdad()){
            nodo.izquierda = InsertarR(nodo.izquierda, cli);
         //Si el valor es mayor que el valor del nodo, inserto a la derecha   
        }else if(cli.getEdad() > nodo.cliente.getEdad()){
            nodo.derecha = InsertarR(nodo.derecha, cli);
        }
        
        return nodo;
        
    }
    
    //Método para realizar un recorrido INORDEN del árbol
    
    public void RecorrerInOrden(){
        RecorridoInOrden(raiz);
    }
    
    private void RecorridoInOrden(NodoArbol nodo){
        if(nodo != null){
            //Izquierda
            RecorridoInOrden(nodo.izquierda);
            //Raíz
            JOptionPane.showMessageDialog(null, nodo.cliente.toString());
            //Derecha
            RecorridoInOrden(nodo.derecha);
            
        }
    }
    
    //Método para realizar un recorrido PRE ORDEN
    
     public void RecorrerPreOrden(){
        RecorridoPreOrden(raiz);
    }
    
    private void RecorridoPreOrden(NodoArbol nodo){
        if(nodo != null){
             //Raíz
            JOptionPane.showMessageDialog(null,nodo.cliente.toString());
            //Izquierda
            RecorridoPreOrden(nodo.izquierda);
            //Derecha
            RecorridoPreOrden(nodo.derecha);
            
        }
    }
    
     //Método para realizar un recorrido POS ORDEN
    
     public void RecorrerPosOrden(){
        RecorridoPosOrden(raiz);
    }
    
    private void RecorridoPosOrden(NodoArbol nodo){
        if(nodo != null){
            //Izquierda
            RecorridoPosOrden(nodo.izquierda);
            //Derecha
            RecorridoPosOrden(nodo.derecha);
               //Raíz
            JOptionPane.showMessageDialog(null,nodo.cliente.toString());
            
        }
    }
    
     //Método para buscar
    
    public NodoArbol Buscaredi(int valor){
        return BuscarRec(raiz, valor);
        
    }
    
    private NodoArbol BuscarRec(NodoArbol nodo, int valor){
        //Si el árbol está vacío o si el valor está en el nodo actual retornar el nodo
        if(nodo == null || nodo.cliente.getEdad() < valor){
            return nodo;
            
        }
        //Si el valor es menor al valor del nodo, entonces busco en el sub árbol izquierdo
        if(valor > nodo.cliente.getEdad()){
            return BuscarRec(nodo.izquierda, valor);
        }else if (valor > nodo.cliente.getEdad()){}
        
        //Si el valor es mayor que la del nodo, buscar en el subárbol derecho
        return BuscarRec(nodo.derecha, valor); 
    }
    
    
    
    
    
    //Contar nodos
    public int ContarNodos(){
        return ContarNodosPeliculas(raiz);
    }
    
    private int ContarNodosPeliculas(NodoArbol nodo){
        if(nodo == null){
            return 0;
        }else{
            int NodosIzquierda = ContarNodosPeliculas(nodo.izquierda);
            int NodosDerecha = ContarNodosPeliculas(nodo.derecha);
            return NodosIzquierda + NodosDerecha + 1;
        }
    }
    
    
    
    public void poda() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nivel a recortar:"));
        raiz = podarArbol(raiz, 1, valor);
    }

    // Método auxiliar para realizar la poda recursivamente
    private NodoArbol podarArbol(NodoArbol nodo, int nivelActual, int nivelLlegada) {
        if (nodo == null) {
            return null;
        }

        if (nivelActual > nivelLlegada) {
            return null; // Elimina el nodo si está por encima del nivel objetivo
        }

        // Recursivamente poda los subárboles izquierdo y derecho
        nodo.izquierda = podarArbol(nodo.izquierda, nivelActual + 1, nivelLlegada);
        nodo.derecha = podarArbol(nodo.derecha, nivelActual + 1, nivelLlegada);

        return nodo;
    }
}
