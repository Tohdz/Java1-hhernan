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
public class ListaDobleCircular {

    private NodoListaDobleCircular cabeza;
    private NodoListaDobleCircular ultimo;

    public ListaDobleCircular() {
    }

    public ListaDobleCircular(NodoListaDobleCircular cabeza, NodoListaDobleCircular ultimo) {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
    }

    public NodoListaDobleCircular getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaDobleCircular cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaDobleCircular getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaDobleCircular ultimo) {
        this.ultimo = ultimo;
    }

    public void Insertar() {
        Actividad miAct = new Actividad();
        miAct.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID de la actividad:")));
        miAct.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripcion de la actividad:"));
        miAct.setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de actividad:"));
        miAct.setCostDolares(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el monto en dolares:")));
        NodoListaDobleCircular act = new NodoListaDobleCircular();
        act.setElemento(miAct);
        if (cabeza == null) {
            cabeza = act;
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);

        } //El nodo que voy a insertar es menor al nodo cabeza (Lo tengo que poner de primero)
        else {
            if (cabeza.getElemento().getId() > act.getElemento().getId()) {
                NodoListaDobleCircular aux = act;
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);

            } else {
                //Paso 3
                if (act.getElemento().getId() > ultimo.getElemento().getId()) {
                    NodoListaDobleCircular aux = act;
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    //Paso 4
                    NodoListaDobleCircular aux = cabeza.getSiguiente();
                    while (aux.getElemento().getId() < act.getElemento().getId()) {
                        aux = aux.getSiguiente();
                    }
                    NodoListaDobleCircular temp = act;
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux);
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);
                }
            }
        }
    }

    public boolean Existe(int ID) {
        boolean Existe = false;

        if (cabeza != null) {
            if (ID >= cabeza.getElemento().getId() && ID <= ultimo.getElemento().getId()) {
                NodoListaDobleCircular aux = cabeza;
                while (aux != ultimo && aux.getElemento().getId() < ID) {
                    aux = aux.getSiguiente();
                }
                Existe = (aux.getElemento().getId() == ID);
            }
        }
        return Existe;

    }

    public void Modifica(Actividad a) {
        if (cabeza != null) {
            if (a.getId() >= cabeza.getElemento().getId() && a.getId() <= ultimo.getElemento().getId()) {
                NodoListaDobleCircular aux = cabeza;
                while (aux != ultimo && aux.getElemento().getId() < a.getId()) {
                    aux = aux.getSiguiente();
                }

                if (aux.getElemento().getId() == a.getId()) {
                    //donde se pone los valores a cambiar
                }
            }
        }

    }

    public void Elimina() {
        if (cabeza != null) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a eliminar:"));
            if (cabeza.getElemento().getId() <= id && id <= ultimo.getElemento().getId()) {
                if (cabeza.getElemento().getId() == id) {
                    cabeza = cabeza.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                } else {
                    NodoListaDobleCircular aux = cabeza;
                    while (aux.getSiguiente() != cabeza && aux.getSiguiente().getElemento().getId() < id) {
                        aux = aux.getSiguiente();

                    }
                    if (aux.getSiguiente().getElemento().getId() == id) {
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

    public Actividad Extrae(int ID) {
        Actividad p = null;
        if (cabeza != null) {
            if (cabeza.getElemento().getId() <= ID && ID <= ultimo.getElemento().getId()) {
                if (cabeza.getElemento().getId() == ID) {
                    p = cabeza.getElemento();
                    cabeza = cabeza.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                } else {
                    NodoListaDobleCircular aux = cabeza;
                    while (aux.getSiguiente() != cabeza && aux.getSiguiente().getElemento().getId() < ID) {
                        aux = aux.getSiguiente();
                    }
                    if (aux.getSiguiente().getElemento().getId() == ID) {
                        p = aux.getSiguiente().getElemento();
                        if (aux.getSiguiente() == ultimo) {
                            ultimo = aux;
                        }
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                }
            }
        }
        return p;
    }

    public String imprimir() {
        String respuesta = "Lista de actividades \n"; //Concatenar los resultados
        if (cabeza != null) {
            NodoListaDobleCircular aux = cabeza;
            respuesta += aux.getElemento() + "\n";
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                respuesta += aux.getElemento() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }
        return respuesta;
    }

    public String imprimir2() {
        String respuesta = "Lista de actividades \n"; //Concatenar los resultados
        if (cabeza != null) {
            NodoListaDobleCircular aux = cabeza;
            respuesta += aux.getElemento() + "\n";
            aux = aux.getAnterior();
            while (aux != cabeza) {
                respuesta += aux.getElemento() + "\n";
                aux = aux.getAnterior();
            }
        } else {
            respuesta += "Vacía";
        }
        return respuesta;
    }

    public void imprimirD() {
        String respuesta = "Actividades diurnas \n"; //Concatenar los resultados
        if (cabeza != null) {
            NodoListaDobleCircular aux = cabeza;
            do {
                if (aux.getElemento().getTipo().equalsIgnoreCase("diurna")||aux.getElemento().getTipo().equalsIgnoreCase("diurno")) {
                    respuesta += aux.getElemento() + "\n";
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        } else {
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
        JOptionPane.showMessageDialog(null,respuesta);
    }
    
    public void imprimirN() {
        String respuesta = "Actividades nocturnas \n"; //Concatenar los resultados
        if (cabeza != null) {
            NodoListaDobleCircular aux = cabeza;
            do {
                if (aux.getElemento().getTipo().equalsIgnoreCase("nocturna")||aux.getElemento().getTipo().equalsIgnoreCase("nocturno")) {
                    respuesta += aux.getElemento() + "\n";
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        } else {
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
        JOptionPane.showMessageDialog(null,respuesta);
    }
}
