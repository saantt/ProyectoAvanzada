package co.edu.uniquindio.proyectofinal.repository;

import co.edu.uniquindio.proyectofinal.model.Notificacion;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NotificacionRepository extends MongoRepository<Notificacion, ObjectId> {
    // Cambia el método para buscar por 'usuarioId'
    List<Notificacion> findByUsuarioId(String usuarioId);
}
