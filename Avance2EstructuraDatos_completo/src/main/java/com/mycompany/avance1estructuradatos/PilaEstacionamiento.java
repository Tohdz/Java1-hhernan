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
public class PilaEstacionamiento {

    private NodoPila top;

    public PilaEstacionamiento() {
    }

    public PilaEstacionamiento(NodoPila top) {
        this.top = top;
    }

    public NodoPila getTop() {
        return top;
    }

    public void setTop(NodoPila top) {
        this.top = top;
    }

    public boolean pilaVacia() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Apilar() {
        Estacionamiento auto = new Estacionamiento();
        auto.setPlaca(JOptionPane.showInputDialog(null, "Digite el número de placa:"));
        auto.setColor(JOptionPane.showInputDialog(null, "Digite el color del auto:"));
        auto.setCantidadPuertas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de puertas:")));

        NodoPila car = new NodoPila();
        car.setElemento(auto);

        if (pilaVacia()) {
            top = car;
        } else {
            car.setSiguienteElemento(top);
            top = car;

        }

    }

    public void Desapilar() {
        if (!pilaVacia()) {
            top = top.getSiguienteElemento();
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }

    public String ImprimirPila() {
        String respuesta = "";
        if (!pilaVacia()) {
            NodoPila temporal = top;
            while (temporal != null) {
                respuesta += temporal.getElemento() + "\n";
                temporal = temporal.getSiguienteElemento();
            }
        } else {
            respuesta = "La pila está vacía";
        }
        return respuesta;
    }

    public void obtenerVehiculo() {
        int cont = 0;
        String placa;
        if (!pilaVacia()) {
            NodoPila aux = top;
            placa = JOptionPane.showInputDialog(null, "Digite el número de placa a buscar:");
            while (aux != null) {
                if (!placa.equalsIgnoreCase(aux.getElemento().getPlaca())) {
                    cont++;
                    aux = aux.getSiguienteElemento();
                } else {
                    aux = aux.getSiguienteElemento();
                }
            }
            JOptionPane.showMessageDialog(null, "Se deben desapilar: " + cont + " auto(s)");
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }

    public void vaciar() {
        while (!pilaVacia()) {
            Desapilar();
        }
        JOptionPane.showMessageDialog(null, "La pila se encuentra vacia");
    }

    public int contar() {
        int cont = 0;
        if (!pilaVacia()) {
            NodoPila aux = top;
            while (aux != null) {
                cont++;
                aux = aux.getSiguienteElemento();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
        return cont;
    }

    public void verificar1(NodoPila temp,String placa) {
        if (placa.equalsIgnoreCase(temp.getElemento().getPlaca())) {
            JOptionPane.showMessageDialog(null, "El auto esta estacionado");
        } else {
            verificar1(temp.getSiguienteElemento(), placa);
        }

    }
    
    public void verificar2(){
        if (!pilaVacia()) {
            String placa=JOptionPane.showInputDialog(null, "Digite el número de placa:");
            verificar1(top,placa);
        }else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }
    
}
