package com.example.demo.model;

import java.rmi.server.ObjID;
import java.time.LocalDate;

public class Comentario {
    Reporte reporte;
    String mensaje;
    LocalDate fecha;
    Usuario usuario;
    ObjID id;

}
