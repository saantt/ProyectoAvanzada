package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Document(collection = "historial_reportes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialReporte {

    @Id
    private ObjectId id;

    private ObjectId reporteId;
    private EstadoReporte estadoPrevio;
    private EstadoReporte estadoNuevo;
    private LocalDateTime fechaCambio;
    private ObjectId usuarioResponsableId;
}
