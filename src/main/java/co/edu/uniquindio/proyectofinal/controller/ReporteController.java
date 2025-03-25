package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.model.Reporte;
import co.edu.uniquindio.proyectofinal.service.ReporteService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public List<Reporte> obtenerTodos() {
        return reporteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reporte> obtenerPorId(@PathVariable ObjectId id) {
        return reporteService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reporte crearReporte(@RequestBody Reporte reporte) {
        return reporteService.guardarReporte(reporte);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReporte(@PathVariable ObjectId id) {
        reporteService.eliminarReporte(id);
        return ResponseEntity.noContent().build();
    }
}
