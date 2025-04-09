package com.medicos.api.model.paciente;

public record DadosListagemPacientes(Integer id, String nome, String email, String telefone, String senha) {

    public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getSenha());
    }
}
