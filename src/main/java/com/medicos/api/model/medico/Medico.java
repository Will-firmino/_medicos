package com.medicos.api.model.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicos")
public class Medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private String endereco;


}
