package co.edu.uniquindio.proyectofinal.repository;

import co.edu.uniquindio.proyectofinal.model.Reporte;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface ReporteRepository extends MongoRepository<Reporte, ObjectId> {
    List<Reporte> findByEstadoActual(String estadoActual);
}
