package com.medicos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicos.api.model.paciente.DadosAtualizacaoPaciente;
import com.medicos.api.model.paciente.DadosCadastroPaciente;
import com.medicos.api.model.paciente.Paciente;
import com.medicos.api.model.paciente.PacienteRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        pacienteRepository.save(new Paciente(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPaciente dados) {
        var paciente = pacienteRepository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id) {
        pacienteRepository.deleteById(id);
    }

    // Listagem e Busca de pacientes

    // Listagem de todos os pacientes (sem filtro, sem paginação)
    @GetMapping("/listar")
    public List<DadosListagemPacientes> listarPacientes() {
        pacienteRepository.findAll();

    }
    // map() -> Mapeia (separa) os elementos de uma lista.
    // stream() -> Faz com que consigamos utilizar métodos prontos.
    // toList -> Transforma o resultado final em uma lista.

}
