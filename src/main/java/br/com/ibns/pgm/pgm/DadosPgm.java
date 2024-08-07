package br.com.ibns.pgm.pgm;

import br.com.ibns.pgm.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DadosPgm(

        @NotBlank
        @Size(min = 2, max = 40)
        String nome,

        @NotBlank
        @Size(min = 2, max = 20)
        String dia,

        @NotBlank
        @Size(min = 2, max = 15)
        String hora,

        @NotNull
        DadosEndereco endereco

) {
}
