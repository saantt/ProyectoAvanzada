package com.example.demo.repository;

import com.example.demo.model.HistorialReporte;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface HistorialReporteRepository extends MongoRepository<HistorialReporte, ObjectId> {
    List<HistorialReporte> findByClienteId(String clienteId);
}
