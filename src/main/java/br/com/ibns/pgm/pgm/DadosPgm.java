package br.com.ibns.pgm.pgm;

import br.com.ibns.pgm.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosPgm(

        @NotBlank
        String nome,

        @NotBlank
        String dia,

        @NotBlank
        String hora,

        @NotNull
        DadosEndereco endereco

) {
}
