package com.fiap.backend_consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.backend_consultas.model.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
    boolean existsByNomeIgnoreCase(String nome);
}
