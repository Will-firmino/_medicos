package com.medicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicos.api.model.medico.DadosCadastroMedico;
import com.medicos.api.model.medico.Medico;
import com.medicos.api.model.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    
    @Autowired // Sobrescrevendo algo, é um padrão utilizado na injeção de depêndencia
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados ) {
        repository.save(new Medico(dados));
    }

}
