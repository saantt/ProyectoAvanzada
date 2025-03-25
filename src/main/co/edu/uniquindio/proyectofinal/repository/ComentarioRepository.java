package co.edu.uniquindio.proyectofinal.repository;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ComentarioRepository extends MongoRepository<Comentario, Object> {
    List<Comentario> findByReportId(String reportId);
}
