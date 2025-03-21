package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId; 
import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId> {  
    Optional<Usuario> findByEmail(String email);
}
