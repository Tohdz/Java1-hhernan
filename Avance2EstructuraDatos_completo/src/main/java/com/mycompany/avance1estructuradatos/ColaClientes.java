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
public class ColaClientes {

    private NodoCola frente;
    private NodoCola ultimo;

    public ColaClientes() {
    }

    public ColaClientes(NodoCola frente, NodoCola ultimo) {
        this.frente = frente;
        this.ultimo = ultimo;
    }

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        return "Cola{" + "frente=" + frente + ", ultimo=" + ultimo + '}';
    }

    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Encolar() {
        Clientes newcliente = new Clientes();
        newcliente.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la identificacion:")));
        newcliente.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
        newcliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad:")));
        newcliente.setMembresia(JOptionPane.showInputDialog(null, "Digite SI en caso de contar con membresia, caso contrario digite NO"));
        newcliente.setFechaReserva(JOptionPane.showInputDialog(null, "Digite la fecha de reserva:"));
        NodoCola tarjeta = new NodoCola();
        tarjeta.setElemento(newcliente);
        if (colaVacia()) {
            frente = tarjeta;
            ultimo = tarjeta;
        } else {
            ultimo.setAtras(tarjeta);
            ultimo = tarjeta;
        }
    }

    public void Atender() {
        NodoCola actual = frente;
        if (!colaVacia()) {
            if (frente != null) {
                frente = frente.getAtras();
                actual.setAtras(null);
            }
            JOptionPane.showMessageDialog(null, actual);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }

    public void vaciar() {
        while (!colaVacia()) {
            NodoCola actual = frente;
            if (frente != null) {
                frente = frente.getAtras();
                actual.setAtras(null);
            }
        }
        JOptionPane.showMessageDialog(null, "La cola se encuentra vacia");
    }

    public void ImprimirCola() {
        String respuesta = "";
        if (!colaVacia()) {
            NodoCola temp = frente;
            System.out.println(temp);
            while (temp != null) {
                respuesta = respuesta + temp.getElemento() + ",";
                System.out.println(temp.getAtras());
                temp = temp.getAtras();
            }
            JOptionPane.showMessageDialog(null, respuesta);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }

    public int contar() {
        int cont = 0;
        if (!colaVacia()) {
            NodoCola aux = frente;
            while (aux != null) {
                cont++;
                aux = aux.getAtras();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
        return cont;
    }

    public void ubicar() {
        int cont = 0;
        if (!colaVacia()) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la identificacion:"));
            NodoCola aux = frente;
            while (id != aux.getElemento().getId()) {
                cont++;
                aux = aux.getAtras();
            }
            JOptionPane.showMessageDialog(null, "La cantidad de clientes adelante es de:" + cont);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }

    public void prioridad(NodoCola temp) {
        if (!"si".equals(frente.getElemento().getMembresia())) {
            if ("no".equals(temp.getElemento().getMembresia())) {
                Encolar2(Atender2());
                temp=frente;
                prioridad(temp);
            }else{
                prioridad(temp.getAtras());
            }  
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentran mas elementos");
        }
    }

    public void verificarPrioridad() {
        if (!colaVacia()) {
            prioridad(frente);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }

    public NodoCola Atender2() {
        NodoCola actual=frente;
        if (actual != null) {
            frente = frente.getAtras();
            actual.setAtras(null);
        }
        return actual;
    }
    
    public void Encolar2(NodoCola aux) {
        if (colaVacia()) {
            frente = aux;
            ultimo = aux;
        } else {
            ultimo.setAtras(aux);
            ultimo = aux;
        }
    }
    
    
}
