package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Reporte;
import co.edu.uniquindio.proyectofinal.repository.ReporteRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    public List<Reporte> obtenerTodos() {
        return reporteRepository.findAll();
    }

    public Optional<Reporte> obtenerPorId(ObjectId id) {
        return reporteRepository.findById(id);
    }

    public Reporte guardarReporte(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    public void eliminarReporte(ObjectId id) {
        reporteRepository.deleteById(id);
    }
}
