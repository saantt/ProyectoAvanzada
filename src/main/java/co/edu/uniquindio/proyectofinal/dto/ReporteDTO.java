package co.edu.uniquindio.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import co.edu.uniquindio.proyectofinal.model.EstadoReporte;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporteDTO {
    private String id; 
    private String titulo;
    private String descripcion;
    private EstadoReporte estadoActual;
    private LocalDateTime fecha;
}
