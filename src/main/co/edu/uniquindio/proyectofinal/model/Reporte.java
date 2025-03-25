package co.edu.uniquindio.proyectofinal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "reportes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reporte {

    @Id
    private ObjectId id;

    private String descripcion;
    private String titulo;
    private int contadorImportante;
    private LocalDateTime fecha;

    private ObjectId clienteId;
    private ObjectId categoriaId;
    private EstadoReporte estadoActual;
    
    private List<ObjectId> comentariosIds;
    private List<String> fotos;
    private Ubicacion ubicacion;
    private List<ObjectId> historialIds;
}
