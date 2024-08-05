package br.com.ibns.pgm.membro;

import br.com.ibns.pgm.endereco.DadosEndereco;

public record DadosAtualizacaoMembros(
        Long id,
        String nome,
        String telefone,
        String email,
        String aniversario,
        DadosEndereco endereco

) {
}
