package co.edu.uniquindio.proyectofinal.dto;

import co.edu.uniquindio.proyectofinal.model.EstadoUsuario;
import co.edu.uniquindio.proyectofinal.model.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String id; 
    private String email;
    private String nombre;
    private String telefono;
    private EstadoUsuario estado;
    private Rol rol;
}
