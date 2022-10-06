package com.teste.primeiroprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.primeiroprojeto.model.Produto;

@Repository
public interface ProdRepository extends JpaRepository<Produto, Integer> {
}
