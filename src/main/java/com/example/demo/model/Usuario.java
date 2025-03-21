package com.example.demo.model;

import java.rmi.server.ObjID;

public class Usuario {
    String email;
    Rol rol;
    String telefono;
    String password;
    String nombre;
    EstadoUsuario estado;   
    Ciudad ciudad;
    CodioValidacion codioValidacion;
    String direccion;
    ObjID id;
}
