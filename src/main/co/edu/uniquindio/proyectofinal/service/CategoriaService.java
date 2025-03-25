package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Categoria;
import co.edu.uniquindio.proyectofinal.repository.CategoriaRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> obtenerPorId(ObjectId id) {
        return categoriaRepository.findById(id);
    }

    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void eliminarCategoria(ObjectId id) {
        categoriaRepository.deleteById(id);
    }
}
