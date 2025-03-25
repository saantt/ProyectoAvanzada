package co.edu.uniquindio.proyectofinal.repository;

import co.edu.uniquindio.proyectofinal.model.HistorialReporte;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface HistorialReporteRepository extends MongoRepository<HistorialReporte, ObjectId> {
    // Ahora se busca por 'clienteId', que existe en la entidad
    List<HistorialReporte> findByClienteId(String usuarioResponsableId);
}
