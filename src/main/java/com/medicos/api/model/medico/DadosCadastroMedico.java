package com.medicos.api.model.medico;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
    
}
