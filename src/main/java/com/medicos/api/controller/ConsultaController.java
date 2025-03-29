package com.medicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicos.api.model.consulta.Consulta;
import com.medicos.api.model.consulta.ConsultaRepository;
import com.medicos.api.model.consulta.DadosAgendamentoConsulta;
import com.medicos.api.model.consulta.DadosAtualizacaoConsulta;
import com.medicos.api.model.medico.MedicoRepository;
import com.medicos.api.model.paciente.PacienteRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;


    @PostMapping
    @Transactional
    public Consulta agendar(@RequestBody DadosAgendamentoConsulta dados) {
        var medico = medicoRepository.getReferenceById(dados.medicoId());
        var paciente = pacienteRepository.getReferenceById(dados.pacienteId());

        var consulta = new Consulta(dados);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);

        return consultaRepository.save(consulta);
    }

    @PutMapping
    @Transactional
    private void atualizar(@RequestBody DadosAtualizacaoConsulta dados) {
        var consulta = consultaRepository.getReferenceById(dados.id());
        consultaRepository.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id) {
        consultaRepository.deleteById(id);
    }





}
