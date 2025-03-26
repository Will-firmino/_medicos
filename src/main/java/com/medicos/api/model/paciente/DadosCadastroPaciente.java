package com.medicos.api.model.paciente;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String cpf, String email, String senha, String telefone, DadosEndereco endereco) { 
    
}
// 