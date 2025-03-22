package com.example.demo.repository;

import com.example.demo.model.Categoria;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, ObjectId> {
}
