package com.api.locaJogos.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientePost {

    @NotBlank
    private String nome;

    @Email
    private String email;

    @NotBlank
    private String telefone;

    @NotBlank
    private String senha;
}
