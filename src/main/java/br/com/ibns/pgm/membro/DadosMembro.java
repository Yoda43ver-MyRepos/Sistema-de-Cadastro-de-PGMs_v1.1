package br.com.ibns.pgm.membro;

import br.com.ibns.pgm.endereco.DadosEndereco;
import jakarta.validation.constraints.*;

public record DadosMembro(

        @NotBlank
        @Size(min = 2, max = 100)
        String nome,

        @NotBlank
        @Pattern(regexp = "^\\(\\d{2}\\)\\s\\d{5}-\\d{4}$", message = "Número de telefone inválido: exemplo => (xx) xxxxxxxxx")
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
