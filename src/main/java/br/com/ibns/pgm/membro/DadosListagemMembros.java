package br.com.ibns.pgm.membro;

public record DadosListagemMembros(

                Long id,
                String nome,
                String telefone,
                String email,
                String aniversario) {

    public DadosListagemMembros(Membro membro){
        this(
                membro.getId(),
                membro.getNome(),
                membro.getTelefone(),
                membro.getEmail(),
                membro.getAniversario());
    }
}
