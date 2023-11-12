/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class MecanicaDiesel extends Especialidades implements Interfaces{
    
    String especialidad="Mecanica automotores diesel";
    Vehiculos v = new Vehiculos();
    
    private static ArrayList<MecanicaDiesel> mecDiesel = new ArrayList();

    public MecanicaDiesel() {
    }

    public MecanicaDiesel(String especialidad, String nombreCliente, String Placa, String nombreMec, String subEspec, int valorRep) {
        super(nombreCliente, Placa, nombreMec, subEspec, valorRep);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public static ArrayList<MecanicaDiesel> getMecDiesel() {
        return mecDiesel;
    }

    public static void setMecDiesel(ArrayList<MecanicaDiesel> mecDiesel) {
        MecanicaDiesel.mecDiesel = mecDiesel;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNombreMec() {
        return nombreMec;
    }

    public void setNombreMec(String nombreMec) {
        this.nombreMec = nombreMec;
    }

    public String getSubEspec() {
        return subEspec;
    }

    public void setSubEspec(String subEspec) {
        this.subEspec = subEspec;
    }

    public int getValorRep() {
        return valorRep;
    }

    public void setValorRep(int valorRep) {
        this.valorRep = valorRep;
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + nombreCliente + ", Placa: " + Placa + ", Nombre del mecanico: " + nombreMec + ", Sub especialidad: " + subEspec + ", valor de Reparacion: " + valorRep + "especialidad=" + especialidad + "==>";
    }

    @Override
    public void agregar() {
        String placas = "Placas disponibles:" + "\n";
        for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
            placas = placas + Vehiculos.getAutos().get(i).getPlaca() + "\n";
            String placaAgre = JOptionPane.showInputDialog(placas + "Digite la placa del cliente a agregar:");
            if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                Placa = placaAgre;
                nombreCliente = Vehiculos.getAutos().get(i).getNombre();
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el valor");
            }
        }
        String mecanicos = "Mecanicos disponibles:" + "\n";
        for (int e = 0; e < Mecanicos.getMecDiesel().size(); e++) {
            mecanicos = mecanicos + Mecanicos.getMecDiesel().get(e).getNombre() + "\n";
            String mecNom = JOptionPane.showInputDialog(mecanicos + "Digite el nombre del mecanico a agregar:");
            if (mecNom.equalsIgnoreCase(Mecanicos.getMecDiesel().get(e).getNombre())) {
                nombreMec = Mecanicos.getMecDiesel().get(e).getNombre();
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el valor");
            }
        }
        subs();
        MecanicaDiesel NewCli = new MecanicaDiesel(especialidad, nombreCliente, Placa, nombreMec, subEspec, valorRep);
        mecDiesel.add(NewCli);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo servicio.");
    }

    @Override
    public void consultar() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < mecDiesel.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Nombre del cliente: " + mecDiesel.get(i).getNombreCliente() + "\n" + "Placa: " + mecDiesel.get(i).getPlaca() + "\n" + "Nombre del mecanico: " + mecDiesel.get(i).getNombreMec() + "\n" +"Especialidad: " + mecDiesel.get(i).getEspecialidad() + "\n"+ "Sub Especialidad: " + mecDiesel.get(i).getSubEspec() + "\n" + "Valor de reparacion: " + mecDiesel.get(i).getValorRep() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < mecDiesel.size(); i++) {
                    info1 = info1 + ( "Nombre del cliente: " + mecDiesel.get(i).getNombreCliente() + "\n" + "Placa: " + mecDiesel.get(i).getPlaca() + "\n" + "Nombre del mecanico: " + mecDiesel.get(i).getNombreMec() + "\n" +"Especialidad: "+mecDiesel.get(i).getEspecialidad()+"\n"+ "Sub Especialidad: " + mecDiesel.get(i).getSubEspec() + "\n" + "Valor de reparacion: " + mecDiesel.get(i).getValorRep() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
    }

    @Override
    public void modificar() {
        String buscarPlaca = JOptionPane.showInputDialog("Digite la placa a buscar: ");
        for (int i = 0; i < mecDiesel.size(); i++) {
            if (buscarPlaca.equalsIgnoreCase(mecDiesel.get(i).getPlaca())) {
                String[] ediciones = {"Nombre del cliente", "Placa", "Nombre del mecanico", "Sub especialidad", "Valor de reparacion","Salir"};
                int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                switch (editar) {
                    case 0:
                        String busqueda = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                        String nuevoNom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                        if (busqueda.equalsIgnoreCase(mecDiesel.get(i).getNombreCliente())) {
                            mecDiesel.get(i).setNombreCliente(nuevoNom);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 1:
                        String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese la placa a buscar: ");
                        String nuevoPla = JOptionPane.showInputDialog(null, "Ingrese la nueva placa: ");
                        if (busqueda1.equalsIgnoreCase(mecDiesel.get(i).getPlaca())) {
                            mecDiesel.get(i).setPlaca(nuevoPla);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 2:
                        String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del mecanico a buscar: ");
                        String nuevoMec = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del mecanico: ");
                        if (busqueda2.equalsIgnoreCase(mecDiesel.get(i).getNombreMec())) {
                            mecDiesel.get(i).setNombreMec(nuevoMec);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 3:
                        String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese la sub especialidad a buscar: ");
                        String nuevosub = JOptionPane.showInputDialog(null, "Ingrese la nueva sub especialidad: ");
                        if (busqueda3.equalsIgnoreCase(mecDiesel.get(i).getSubEspec())) {
                            mecDiesel.get(i).setSubEspec(nuevosub);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 4:
                        int busqueda4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de reparacion a buscar: "));
                        int nuevorep = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor: "));
                        if (busqueda4 == mecDiesel.get(i).getValorRep()) {
                            mecDiesel.get(i).setValorRep(nuevorep);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 5:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el valor de placa");
            }
        }
    }

    @Override
    public void eliminar() {
        String placabus = JOptionPane.showInputDialog("Ingrese el numero de placa a eliminar: ");
        for (int i = 0; i < mecDiesel.size(); i++) {
            if (placabus.equalsIgnoreCase(mecDiesel.get(i).getPlaca())) {
                mecDiesel.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                break;
            }
        }
    }
    
    public void menuDiesel() {
        int opcion;
        do {
            String[] opciones = {"Agregar", "Consultar", "Modificar", "Eliminar","Pagar", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso de servicio", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    agregar();
                    break;
                case 1:
                    consultar();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    calcularMontoTotal();
                    realizarPago();
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }
    
    public void subs(){
        int opcion;
        do {
            String[] opciones = {"Revision de motor", "Tune up", "Desgastes mecanicos", "Sistemas electricos","Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso de sub especialidades", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    subEspec="Revision de motor";
                    valorRep=60000;
                    v.incrementarContador();
                    JOptionPane.showMessageDialog(null, "Servicio agregado correctamente.");
                    break;
                case 1:
                    subEspec="Tune up";
                    valorRep=100000;
                    v.incrementarContador();
                    JOptionPane.showMessageDialog(null, "Servicio agregado correctamente.");
                    break;
                case 2:
                    subEspec="Desgastes mecanicos";
                    valorRep=200000;
                    v.incrementarContador();
                    JOptionPane.showMessageDialog(null, "Servicio agregado correctamente.");
                    break;
                case 3:
                    subEspec="Sistemas electricos";
                    valorRep=80000;
                    v.incrementarContador();
                    JOptionPane.showMessageDialog(null, "Servicio agregado correctamente.");
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }
  
     public static void imprimirInforme(ArrayList<Vehiculos> autos) {
        StringBuilder informe = new StringBuilder("Información de Vehículos:\n");

        for (Vehiculos auto : autos) {
            String placa = auto.getPlaca();
            String nombre = auto.getNombre();
            String modelo = auto.getModelo();
            String especialidad = auto.getEspecialidadReferencia();
        }
     }
    
public double calcularMontoTotal() {
    double montoTotal = 0;
    for (int i = 0; i < mecDiesel.size(); i++) {
        MecanicaDiesel servicio = mecDiesel.get(i);
        montoTotal += servicio.getValorRep();
    }
    return montoTotal;
}

public void realizarPago() {
    double subtotal = calcularMontoTotal();
    double iva = subtotal * 0.13;  // Calcula el IVA al 13%
    double total = subtotal + iva;
    String nombre = "";
    String placa = "";
    String espec = "";
    String marca = "";
    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
    nombre = Vehiculos.getAutos().get(i).getNombre(); 
    placa = Vehiculos.getAutos().get(i).getPlaca(); 
    espec = Vehiculos.getAutos().get(i).getEspecialidadReferencia();
    marca = Vehiculos.getAutos().get(i).getMarca(); 
    
 
    // Generar un número de factura
    int numeroFactura = 1;
    numeroFactura++;

    // Pregunta al usuario por la fecha
    String fecha = JOptionPane.showInputDialog("Ingrese la fecha (dd/mm/yyyy): ");

    // Mostrar el detalle de la factura
    String facturaDetalle = "Número de factura: " + numeroFactura + "\n";
    facturaDetalle += "Cliente:" + nombre + "\n";
    facturaDetalle += "Fecha: " + fecha + "\n";
    facturaDetalle += "---------------------------------------------------------\n";
    facturaDetalle += "Detalles\n";
    facturaDetalle += "---------------------------------------------------------\n";
    facturaDetalle += "Vehículo:" + marca + " " + placa + "\n";
    facturaDetalle += "Especialidad: " + espec + "\n";
    facturaDetalle += "Subtotal: $" + subtotal + "\n";
    facturaDetalle += "IVA (13%): $" + iva + "\n";


    double montoRecibido;
    boolean montoInsuficiente;

    do {
        montoRecibido = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto recibido: "));
        if (montoRecibido < total) {
            JOptionPane.showMessageDialog(null, "El monto recibido es insuficiente. Debe pagar al menos $" + total);
            montoInsuficiente = true;
        } else {
            montoInsuficiente = false;
        }
    } while (montoInsuficiente);

    int visitas = v.getCont_servicios(); // Obtener el contador de servicios
    v.incrementarContador(); // Incrementar el contador de servicios

    double descuento = 0.0;
    if (visitas > 1) {
        descuento = subtotal * 0.05;  // Descuento del 5%
        total = subtotal - descuento;
        facturaDetalle += "Descuento aplicado: 5%\n";
    }

    facturaDetalle += "Descuento: $" + total + "\n";
    facturaDetalle += "---------------------------------------------------------\n";
    facturaDetalle += "Total a pagar: $" + total + "\n";
    facturaDetalle += "Monto recibido: $" + montoRecibido + "\n";
    double cambio = montoRecibido - total;
    facturaDetalle += "Cambio: $" + cambio + "\n";
    facturaDetalle += "---------------------------------------------------------\n";
    facturaDetalle += "¡Gracias por su preferencia!";

    JOptionPane.showMessageDialog(null, facturaDetalle);
}

}
}

 