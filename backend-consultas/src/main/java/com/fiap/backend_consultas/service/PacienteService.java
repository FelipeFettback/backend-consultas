package com.fiap.backend_consultas.service;

import com.fiap.backend_consultas.model.Paciente;
import com.fiap.backend_consultas.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente paciente){
        return repository.save(paciente);
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }

    public Paciente getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado."));
    }
    public Paciente atualizar(Long id, Paciente pacienteAtualizado) {
        Paciente pacienteExistente = getById(id);
        pacienteExistente.setNome(pacienteAtualizado.getNome());
        pacienteExistente.setCpf(pacienteAtualizado.getCpf());
        pacienteExistente.setEmail(pacienteAtualizado.getEmail());
        pacienteExistente.setTelefone(pacienteAtualizado.getTelefone());
        pacienteExistente.setDataNascimento(pacienteAtualizado.getDataNascimento());
        pacienteExistente.setAtivo(pacienteAtualizado.getAtivo());
        return repository.save(pacienteExistente);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
