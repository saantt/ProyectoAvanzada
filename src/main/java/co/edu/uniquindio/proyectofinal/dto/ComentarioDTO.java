package co.edu.uniquindio.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComentarioDTO {
    private String id;          
    private String contenido;   
    private LocalDateTime fecha; 
    private String usuarioId;   
    private String reporteId;   
}
