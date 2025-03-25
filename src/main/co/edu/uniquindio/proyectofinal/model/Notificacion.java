package co.edu.uniquindio.proyectofinal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Document(collection = "notificaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notificacion {

    @Id
    private ObjectId id;

    private String mensaje;
    private ObjectId usuarioDestinoId;
    private LocalDateTime fechaCreacion;
    private boolean leido;
}
