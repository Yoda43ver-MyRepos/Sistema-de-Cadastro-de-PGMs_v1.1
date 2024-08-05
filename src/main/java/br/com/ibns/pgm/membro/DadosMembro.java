package br.com.ibns.pgm.membro;

import br.com.ibns.pgm.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosMembro(

        @NotBlank
        String nome,

        @NotBlank
        String telefone,

        @NotBlank
        @Email
        String email,

        @Pattern(regexp = "^\\d{2}/\\d{2}$", message = "Data de aniversário inválida. Formato esperado: dd/MM")
        String aniversario,

        @NotNull
        DadosEndereco endereco


) {
}
