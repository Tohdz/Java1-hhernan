/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fide.codigografos;

import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Grafo {

    private List<Nodo> nodos;
    private int[][] matrizAdyacencia;
    private int numNodos;

    public Grafo() {
        nodos = new ArrayList<>();
    }

    public void InsertarNodo(String origen, String destino, int peso) {
        Nodo nuevoNodo = new Nodo(origen, destino, peso);
        nodos.add(nuevoNodo);
        actualizarMatrizAdyacencia();
    }

    public void actualizarMatrizAdyacencia() {
        numNodos = obtenerNumNodos();
        matrizAdyacencia = new int[numNodos][numNodos];
        for (Nodo nodo : nodos) {
            int indiceOrigen = obtenerIndice(nodo.getOrigen());
            int indiceDestino = obtenerIndice(nodo.getDestino());
            // la segunda es para realizar el grafo no dirigido, ya que esto debe quedar en la matriz de adyacencia.
            matrizAdyacencia[indiceOrigen][indiceDestino] = nodo.getPeso();
            matrizAdyacencia[indiceDestino][indiceOrigen] = nodo.getPeso();
        }
    }

    public void ImprimirMatrizAdyacencia() {
        StringBuilder matrizString = new StringBuilder("Matriz de Adyacencia:\n");
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                matrizString.append(matrizAdyacencia[i][j]).append(" ");
            }
            matrizString.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizString.toString(), "Matriz de Adyacencia", JOptionPane.INFORMATION_MESSAGE);
    }

    private int obtenerNumNodos() {
        int maxIndice = 0;
        for (Nodo nodo : nodos) {
            maxIndice = Math.max(maxIndice, Math.max(obtenerIndice(nodo.getOrigen()), obtenerIndice(nodo.getDestino())));
        }
        return maxIndice + 1;
    }

    private int obtenerIndice(String nodo) {
        return nodo.charAt(0) - 'A';
    }

    public void imprimirNodos() {
        String info = "";
        for (Nodo nodo : nodos) {
            info = info + "Origen: " + nodo.getOrigen() + ", Destino: " + nodo.getDestino() + ", Peso: " + nodo.getPeso() + "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    public List<String> encontrarRutaMasCorta(String origen, String destino) {
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> padres = new HashMap<>();
        PriorityQueue<String> colaPrioridad = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        // Inicialización de distancias y padres
        for (String nodo : nodos.stream().map(Nodo::getOrigen).distinct().toArray(String[]::new)) {
            distancias.put(nodo, nodo.equals(origen) ? 0 : Integer.MAX_VALUE);
            padres.put(nodo, null);
            colaPrioridad.add(nodo);
        }

        // Algoritmo de Dijkstra
        while (!colaPrioridad.isEmpty()) {
            String nodoActual = colaPrioridad.poll();

            for (Nodo vecino : nodos.stream().filter(n -> n.getOrigen().equals(nodoActual)).toArray(Nodo[]::new)) {
                int distanciaActual = distancias.get(nodoActual);
                if (distanciaActual == Integer.MAX_VALUE) {
                    // No se puede llegar al nodo actual, evita NullPointerException
                    continue;
                }

                int nuevaDistancia = distanciaActual + vecino.getPeso();
                if (nuevaDistancia < distancias.getOrDefault(vecino.getDestino(), Integer.MAX_VALUE)) {
                    distancias.put(vecino.getDestino(), nuevaDistancia);
                    padres.put(vecino.getDestino(), nodoActual);
                    // Actualiza la cola de prioridad con las nuevas distancias
                    colaPrioridad.remove(vecino.getDestino());
                    colaPrioridad.add(vecino.getDestino());
                }
            }
        }

        // Reconstruye la ruta desde el destino hasta el origen
        List<String> ruta = new ArrayList<>();
        String nodo = destino;
        while (nodo != null) {
            ruta.add(0, nodo);
            nodo = padres.get(nodo);
        }

        return ruta;
    }
    private boolean Mayusculas(String nodo) {
        return nodo.equals(nodo.toUpperCase());
    }

    public void Ruta() {
        String origen = JOptionPane.showInputDialog("Ingrese el nodo de origen:");
        String destino = JOptionPane.showInputDialog("Ingrese el nodo de destino:");
        if (!Mayusculas(origen) || !Mayusculas(destino)) {
            JOptionPane.showMessageDialog(null, "Los nodos deben estar en mayúsculas.");
            return;
        }
        List<String> rutaMasCorta = encontrarRutaMasCorta( origen, destino);
        JOptionPane.showMessageDialog(null, "Ruta más corta: " + rutaMasCorta);
    }

}
