package com.example.demo.repository;

import com.example.demo.model.Notificacion;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NotificacionRepository extends MongoRepository<Notificacion, ObjectId> {
    List<Notificacion> findByIdUsuario(String idUsuario);
}
