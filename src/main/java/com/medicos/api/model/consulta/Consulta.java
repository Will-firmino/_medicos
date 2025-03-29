package com.medicos.api.model.consulta;

import java.time.LocalDateTime;

import com.medicos.api.model.medico.Medico;
import com.medicos.api.model.paciente.Paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "medicoId")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "pacienteId")
    private Paciente paciente; 

    private String observacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime data;

    public Consulta(DadosAgendamentoConsulta dados) {
        this.medico = dados.medicoId();
        this.paciente = dados.pacienteId();
        this.observacao = dados.observacao();
        this.status = dados.status();
        this.data = dados.data();
}

    public void atualizarInformacoes(DadosAtualizacaoConsulta dados) {
        if (dados.medicoId() != null) {
            this.medico = dados.medicoId();
        }
        if (dados.pacienteId() != null) {
            this.paciente = dados.pacienteId();
        }
        if (dados.observacao() != null) {
            this.observacao = dados.observacao();
        }
        if (dados.status() != null) {
            this.status = dados.status();
        }
        if (dados.data() != null) {
            this.data = dados.data();
        }
    }

}
