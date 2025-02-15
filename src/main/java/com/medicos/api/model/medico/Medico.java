package com.medicos.api.model.medico;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private String endereco;


}
