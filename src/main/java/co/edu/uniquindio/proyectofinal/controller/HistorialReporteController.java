package co.edu.uniquindio.proyectofinal.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.uniquindio.proyectofinal.model.HistorialReporte;
import co.edu.uniquindio.proyectofinal.service.HistorialReporteService;

import java.util.List;


@RestController
@RequestMapping("/historial-reportes")
public class HistorialReporteController {

    @Autowired
    private HistorialReporteService historialReporteService;

    @GetMapping
    public List<HistorialReporte> obtenerTodos() {
        return historialReporteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialReporte> obtenerPorId(@PathVariable ObjectId id) {
        return historialReporteService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HistorialReporte crearHistorial(@RequestBody HistorialReporte historialReporte) {
        return historialReporteService.guardarHistorial(historialReporte);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHistorial(@PathVariable ObjectId id) {
        historialReporteService.eliminarHistorial(id);
        return ResponseEntity.noContent().build();
    }
}
