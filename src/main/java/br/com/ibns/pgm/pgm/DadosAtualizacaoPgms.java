package br.com.ibns.pgm.pgm;

import br.com.ibns.pgm.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPgms(
        @NotNull
        Long id,
        String nome,
        String dia,
        String hora,
        DadosEndereco endereco
) {
}
