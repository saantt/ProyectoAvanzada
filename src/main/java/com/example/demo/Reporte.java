package com.example.demo;

import java.rmi.server.ObjID;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporte {
    ArrayList<HistorialReporte> historialReporte;
    LocalDate fecha;
    String descripcion;
    int contador;
    Usuario usuario;
    String titulo;
    Ubicacion ubicacion;
    ObjID id;
    Categoria categoria;
    ArrayList<String> fotos;
    EstadoReporte estado;
}
