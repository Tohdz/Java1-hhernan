/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class ListaDobleCircular2 {

    private NodoListaDobleCircular2 cabeza;
    private NodoListaDobleCircular2 ultimo;

    public ListaDobleCircular2() {
    }

    public ListaDobleCircular2(NodoListaDobleCircular2 cabeza, NodoListaDobleCircular2 ultimo) {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
    }

    public NodoListaDobleCircular2 getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaDobleCircular2 cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaDobleCircular2 getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaDobleCircular2 ultimo) {
        this.ultimo = ultimo;
    }

    public void Insertar() {
        Random random = new Random();
        int canthabit = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de habitaciones a ofrecer:"));
        for (int i = 1; i < canthabit + 1; i++) {
            Habitaciones habit = new Habitaciones();
            habit.setId(i);
            if (i % 2 == 0) {
                habit.setTipo("Estandar");
            } else {
                habit.setTipo("Premium");
            }
            habit.setCantCamas(random.nextInt(3 - 1 + 1) + 1);
            habit.setDispo(false);
            if (habit.getTipo().equalsIgnoreCase("Estandar")) {
                habit.setPrecio(350);
            } else {
                habit.setPrecio(730);
            }

            NodoListaDobleCircular2 habita = new NodoListaDobleCircular2();
            habita.setHabitacion(habit);
            if (cabeza == null) {
                cabeza = habita;
                ultimo = cabeza;
                cabeza.setAnterior(ultimo);
                cabeza.setSiguiente(ultimo);
                ultimo.setSiguiente(cabeza);
                ultimo.setAnterior(cabeza);

            } //El nodo que voy a insertar es menor al nodo cabeza (Lo tengo que poner de primero)
            else {
                if (cabeza.getHabitacion().getId() > habita.getHabitacion().getId()) {
                    NodoListaDobleCircular2 aux = habita;
                    aux.setSiguiente(cabeza);
                    cabeza.setAnterior(aux);
                    cabeza = aux;
                    cabeza.setAnterior(ultimo);
                    ultimo.setSiguiente(cabeza);

                } else {
                    //Paso 3
                    if (habita.getHabitacion().getId() > ultimo.getHabitacion().getId()) {
                        NodoListaDobleCircular2 aux = habita;
                        aux.setAnterior(ultimo);
                        ultimo.setSiguiente(aux);
                        ultimo = aux;
                        ultimo.setSiguiente(cabeza);
                        cabeza.setAnterior(ultimo);
                    } else {
                        //Paso 4
                        NodoListaDobleCircular2 aux = cabeza.getSiguiente();
                        while (aux.getHabitacion().getId() < habita.getHabitacion().getId()) {
                            aux = aux.getSiguiente();
                        }
                        NodoListaDobleCircular2 temp = habita;
                        temp.setAnterior(aux.getAnterior());
                        temp.setSiguiente(aux);
                        aux.setAnterior(temp);
                        temp.getAnterior().setSiguiente(temp);
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Habitaciones agregadas correctamente");
    }

    public void Modifica() {
        if (cabeza != null) {
            String respuesta = "Habitaciones estandar \n";
            String respuesta1 = "Habitaciones premium \n";
            int idBusc;
            String[] opciones = {"Estandar", "Premium"};
            int opcion = JOptionPane.showOptionDialog(null, "Menu de reserva ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Estandar");
            switch (opcion) {
                case 0:
                    NodoListaDobleCircular2 aux = cabeza;
                    do {
                        if (aux.getHabitacion().getTipo().equalsIgnoreCase("estandar") && aux.getHabitacion().isDispo() == false) {
                            respuesta += aux.getHabitacion() + "\n";
                        }
                        aux = aux.getSiguiente();
                    } while (aux != cabeza);
                    break;
                case 1:
                    NodoListaDobleCircular2 aux1 = cabeza;
                    do {
                        if (aux1.getHabitacion().getTipo().equalsIgnoreCase("premium") && aux1.getHabitacion().isDispo() == false) {
                            respuesta1 += aux1.getHabitacion() + "\n";
                        }
                        aux1 = aux1.getSiguiente();
                    } while (aux1 != cabeza);
                    break;
            }
            if (opcion == 0) {
                idBusc = Integer.parseInt(JOptionPane.showInputDialog(null, respuesta + "\n" + "Digite el ID a reservar: "));
            } else {
                idBusc = Integer.parseInt(JOptionPane.showInputDialog(null, respuesta1 + "\n" + "Digite el ID a reservar: "));
            }
            if (idBusc >= cabeza.getHabitacion().getId() && idBusc <= ultimo.getHabitacion().getId()) {
                NodoListaDobleCircular2 aux = cabeza;
                while (aux != ultimo && aux.getHabitacion().getId() < idBusc) {
                    aux = aux.getSiguiente();
                }
                if (aux.getHabitacion().getId() == idBusc) {
                    aux.getHabitacion().setDispo(true);
                }
            }
            JOptionPane.showMessageDialog(null, "Reserva exitosa");
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void Elimina() {
        if (cabeza != null) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a eliminar:"));
            if (cabeza.getHabitacion().getId() <= id && id <= ultimo.getHabitacion().getId()) {
                if (cabeza.getHabitacion().getId() == id) {
                    cabeza = cabeza.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                } else {
                    NodoListaDobleCircular2 aux = cabeza;
                    while (aux.getSiguiente() != cabeza && aux.getSiguiente().getHabitacion().getId() < id) {
                        aux = aux.getSiguiente();

                    }
                    if (aux.getSiguiente().getHabitacion().getId() == id) {
                        if (aux.getSiguiente() == ultimo) {
                            ultimo = aux;
                        }
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void imprimir() {
        String respuesta = "Habitaciones disponibles: \n"; //Concatenar los resultados
        if (cabeza != null) {
            NodoListaDobleCircular2 aux = cabeza;
            do {
                if (aux.getHabitacion().isDispo() == false) {
                    respuesta += aux.getHabitacion() + "\n";
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            JOptionPane.showMessageDialog(null, respuesta);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void IncremetaValor() {
        if (cabeza != null) {
            String valor = "";
            int valorN=0;
            double porcentaje = 0;
            String[] opciones = {"Tipo de habitacion", "Cantidad de camas", "Precio de habitaciones"};
            int opcion = JOptionPane.showOptionDialog(null, "Menu de criterios", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Tipo de habitacion");
            switch (opcion) {
                case 0:
                    String[] opciones0 = {"Estandar", "Premium"};
                    int opcion0 = JOptionPane.showOptionDialog(null, "Submenu de criterios", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones0, "Estandar");
                    switch (opcion0) {
                        case 0:
                            valor = "Estandar";
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                        case 1:
                            valor = "Premium";
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                    }
                    break;
                case 1:
                    String[] opciones1 = {"Simple", "Doble", "Triple"};
                    int opcion1 = JOptionPane.showOptionDialog(null, "Submenu de criterios", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Simple");
                    switch (opcion1) {
                        case 0:
                            valorN = 1;
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                        case 1:
                            valorN = 2;
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                        case 2:
                            valorN = 3;
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                    }
                    break;
                case 2:
                    String[] opciones2 = {"$350", "$730"};
                    int opcion2 = JOptionPane.showOptionDialog(null, "Submenu de criterios", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones2, "Simple");
                    switch (opcion2) {
                        case 0:
                            valorN=350;
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                        case 1:
                            valorN = 730;
                            porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje a agregar:"));
                            break;
                    }
                    break;
            }
            NodoListaDobleCircular2 aux = cabeza;
            do {
                if (opcion==0) {
                    if (aux.getHabitacion().getTipo().equalsIgnoreCase(valor)) {
                        aux.getHabitacion().setPrecio(((porcentaje/100)*aux.getHabitacion().getPrecio())+aux.getHabitacion().getPrecio());
                    }
                }else if (opcion==1){
                    if (aux.getHabitacion().getCantCamas()==valorN) {
                        aux.getHabitacion().setPrecio(((porcentaje/100)*aux.getHabitacion().getPrecio())+aux.getHabitacion().getPrecio());
                    }
                }else if (opcion==2){
                    if (aux.getHabitacion().getPrecio()==valorN) {
                        aux.getHabitacion().setPrecio(((porcentaje/100)*aux.getHabitacion().getPrecio())+aux.getHabitacion().getPrecio());
                    }
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

}
