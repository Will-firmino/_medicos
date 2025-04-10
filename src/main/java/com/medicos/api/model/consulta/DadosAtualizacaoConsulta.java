package com.medicos.api.model.consulta;

import java.time.LocalDateTime;

import com.medicos.api.model.medico.Medico;
import com.medicos.api.model.paciente.Paciente;

public record DadosAtualizacaoConsulta(Integer id, Integer medicoId, Integer pacienteId, String observacao,
        Status status, LocalDateTime data) {

}
