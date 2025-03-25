package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.repository.ComentarioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> obtenerTodos() {
        return comentarioRepository.findAll();
    }

    public Optional<Comentario> obtenerPorId(ObjectId id) {
        return comentarioRepository.findById(id);
    }

    public Comentario guardarComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public void eliminarComentario(ObjectId id) {
        comentarioRepository.deleteById(id);
    }
}
