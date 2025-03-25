package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.HistorialReporte;
import co.edu.uniquindio.proyectofinal.HistorialReporteService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
