package com.medicos.api.model.paciente;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(Integer id, String email, String nome, String telefone, DadosEndereco endereco) {
    
}
