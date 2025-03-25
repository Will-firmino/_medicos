package com.medicos.api.model.medico;

import com.medicos.api.model.endereco.DadosEndereco;


public record DadosAtualizacaoMedico(Integer id, String nome, String email, DadosEndereco endereco) {
    
}
