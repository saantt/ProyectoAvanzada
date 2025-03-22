package com.example.demo.repository;

import com.example.demo.model.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ComentarioRepository extends MongoRepository<Comentario, Object> {
    List<Comentario> findByReportId(String reportId);
}
