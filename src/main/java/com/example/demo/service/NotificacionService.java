package com.example.demo.service;

import com.example.demo.model.Notificacion;
import com.example.demo.repository.NotificacionRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    public List<Notificacion> obtenerTodas() {
        return notificacionRepository.findAll();
    }

    public Optional<Notificacion> obtenerPorId(ObjectId id) {
        return notificacionRepository.findById(id);
    }

    public Notificacion guardarNotificacion(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    public void eliminarNotificacion(ObjectId id) {
        notificacionRepository.deleteById(id);
    }
}
