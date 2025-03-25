package co.edu.uniquindio.proyectofinal.repository;

import co.edu.uniquindio.proyectofinal.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId; 
import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId> {  
    Optional<Usuario> findByEmail(String email);
}
