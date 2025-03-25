package co.edu.uniquindio.proyectofinal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Document(collection = "comentarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comentario {

    @Id
    private ObjectId id;

    private String contenido;
    private LocalDateTime fechaCreacion;
    private ObjectId usuarioId;
    private ObjectId reporteId;
}
