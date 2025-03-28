package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.HistorialReporte;
import co.edu.uniquindio.proyectofinal.repository.HistorialReporteRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialReporteService {

    @Autowired
    private HistorialReporteRepository historialReporteRepository;

    public List<HistorialReporte> obtenerTodos() {
        return historialReporteRepository.findAll();
    }

    public Optional<HistorialReporte> obtenerPorId(ObjectId id) {
        return historialReporteRepository.findById(id);
    }

    public HistorialReporte guardarHistorial(HistorialReporte historialReporte) {
        return historialReporteRepository.save(historialReporte);
    }

    public void eliminarHistorial(ObjectId id) {
        historialReporteRepository.deleteById(id);
    }
}
