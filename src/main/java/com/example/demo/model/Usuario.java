package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.util.List;

@Document(collection = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private ObjectId id;

    private String email;
    private String password;
    private String nombre;
    private String telefono;

    private ObjectId ciudadId;
    private EstadoUsuario estado;
    private CodigoValidacion codigoValidacion;
    private String direccion;
    private ObjectId rolId;

    private List<ObjectId> reportesIds;
    private List<ObjectId> comentariosIds;
}
