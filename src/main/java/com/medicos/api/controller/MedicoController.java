package com.medicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicos.api.model.medico.DadosAtualizacaoMedico;
import com.medicos.api.model.medico.DadosCadastroMedico;
import com.medicos.api.model.medico.Medico;
import com.medicos.api.model.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    
    @Autowired // Sobrescrevendo algo, é um padrão utilizado na injeção de depêndencia
    private MedicoRepository repository;

    // Aqui fica o método de criação - CREATE
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados ) {
        repository.save(new Medico(dados));
    }

    // Aqui fica o método de atualização - UPDATE
    // nome, email, endereco
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    // Aqui fica o método de exclusão - DELETE

    // Exclusão - Estou excluindo mesmo.
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluir(@PathVariable Integer id){
    //     repository.deleteById(id);
    // }

    // Exclusão Lógica - Uma regra de negócio que permite que um registro seja excluido sem apagar do banco de dados
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id) {
        
    }





    // Aqui fica o método de consulta - READ


}
