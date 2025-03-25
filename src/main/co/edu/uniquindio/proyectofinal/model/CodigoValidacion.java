package co.edu.uniquindio.proyectofinal.model;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CodigoValidacion {

    private String codigo;
    private LocalDateTime fechaExpiracion;
}
