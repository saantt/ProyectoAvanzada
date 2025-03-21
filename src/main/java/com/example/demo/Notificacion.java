package com.example.demo;

import java.rmi.server.ObjID;
import java.time.LocalDate;

public class Notificacion {
    String mensaje;
    LocalDate fecha;
    String tipo;
    ObjID id;
    boolean leido;
    Usuario usuario;
    Reporte reporte;
}
