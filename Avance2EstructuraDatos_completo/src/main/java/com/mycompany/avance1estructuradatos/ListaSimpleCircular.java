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
public class ListaSimpleCircular {

    NodoListaCircular cabeza;
    NodoListaCircular ultimo;

    public ListaSimpleCircular() {
    }

    public ListaSimpleCircular(NodoListaCircular cabeza, NodoListaCircular ultimo) {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
    }

    public NodoListaCircular getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaCircular cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaCircular getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaCircular ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        return "cabeza=" + cabeza + ", ultimo=" + ultimo + "==>";
    }

    public void Insertar() {
        Desayuno desay = new Desayuno();
        desay.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el iD:")));
        desay.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripcion del desayuno:"));
        desay.setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de desayuno:"));
        desay.setCantCalorias(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de calorias:")));
        NodoListaCircular desa = new NodoListaCircular();
        desa.setDesa(desay);
        //Validar si la lista está vacía
        if (cabeza == null) {
            cabeza = desa;
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);

        } else {
            //Cuando el elemento que quiero insertar va de primero o es menor a la cabeza
            if (desa.getDesa().getId() < cabeza.getDesa().getId()) {
                //Insertar al inicio
                NodoListaCircular auxiliar = desa;
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            } else {
                //El elemento podría ir de último
                if (ultimo.getDesa().getId() < desa.getDesa().getId()) {
                    //Insertar al final
                    NodoListaCircular auxiliar = desa;
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                } else {
                    //El elemento va en el medio de la lista
                    NodoListaCircular auxiliar = cabeza;
                    while (auxiliar.getSiguiente().getDesa().getId() < desa.getDesa().getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoListaCircular temporal = desa;
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Se ha agregado un desayuno");
    }

    public String imprimir() {
        String respuesta = "Lista circular: \n";
        NodoListaCircular aux = cabeza;
        if (aux != null) {
            respuesta += aux.getDesa();
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                respuesta += aux.getDesa() + "\n";
                aux = aux.getSiguiente();

            }
        } else {
            respuesta += "Vacía";
        }
        return respuesta;
    }

    public boolean Existe(int id) {
        boolean Existe = false;

        if (cabeza != null) {
            if (id >= cabeza.getDesa().getId() && id <= ultimo.getDesa().getId()) {
                NodoListaCircular aux = cabeza;
                while (aux != ultimo && aux.getDesa().getId() < id) {
                    aux = aux.getSiguiente();
                }
                Existe = (aux.getDesa().getId() == id);
            }
        }
        return Existe;
    }

    public Desayuno extraer(int id) {
        NodoListaCircular aux = cabeza;
        while (id != aux.getDesa().getId()) {
            aux = aux.getSiguiente();
        }
        return aux.getDesa();
    }

    public void Modifica() {
        if (cabeza != null) {
            int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar:"));
            if (idBuscar >= cabeza.getDesa().getId() && idBuscar <= ultimo.getDesa().getId()) {
                NodoListaCircular aux = cabeza;
                while (aux != ultimo && aux.getDesa().getId() < idBuscar) {
                    aux = aux.getSiguiente();
                }
                if (aux.getDesa().getId() == idBuscar) {
                    aux.getDesa().setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripcion del desayuno:"));
                    aux.getDesa().setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de desayuno:"));
                    aux.getDesa().setCantCalorias(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de calorias:")));
                    JOptionPane.showMessageDialog(null, "Se ha modificado correctamente");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void menosCalorias() {
        String desayunos = "Desayunos: \n";
        if (cabeza != null) {
            int busCal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad máxima de calorías a consumir:"));
            NodoListaCircular aux = cabeza;
            do {
                if (aux.getDesa().getCantCalorias() <= busCal) {
                    desayunos += aux.getDesa() + "\n";
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            JOptionPane.showMessageDialog(null, desayunos);
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
    }

    public void Elimina(int id) {
        if (cabeza != null) {
            if (cabeza.getDesa().getId() <= id && id <= ultimo.getDesa().getId()) {
                if (cabeza.getDesa().getId() == id) {
                    cabeza = cabeza.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                } else {
                    NodoListaCircular aux = cabeza;
                    while (aux.getSiguiente() != cabeza && aux.getSiguiente().getDesa().getId() < id) {
                        aux = aux.getSiguiente();

                    }
                    if (aux.getSiguiente().getDesa().getId() == id) {
                        if (aux.getSiguiente() == ultimo) {
                            ultimo = aux;
                        }
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                }
            }
        }
    }

    public Desayuno Extrae(int ID) {
        Desayuno des = null;
        if (cabeza != null) {
            if (cabeza.getDesa().getId() <= ID && ID <= ultimo.getDesa().getId()) {
                if (cabeza.getDesa().getId() == ID) {
                    des = cabeza.getDesa();
                    cabeza = cabeza.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                } else {
                    NodoListaCircular aux = cabeza;
                    while (aux.getSiguiente() != cabeza && aux.getSiguiente().getDesa().getId() < ID) {
                        aux = aux.getSiguiente();
                    }
                    if (aux.getSiguiente().getDesa().getId() == ID) {
                        des = aux.getSiguiente().getDesa();
                        if (aux.getSiguiente() == ultimo) {
                            ultimo = aux;
                        }
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                }
            }
        }
        return des;
    }
}
