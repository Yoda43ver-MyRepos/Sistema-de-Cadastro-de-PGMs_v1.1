package br.com.ibns.pgm.pgm;

public record DadosListagemPgms(
        Long id,
        String nome,
        String dia,
        String hora

) {

    public DadosListagemPgms(Pgm pgm){
        this(
                pgm.getId(),
                pgm.getNome(),
                pgm.getDia(),
                pgm.getHora()

        );
    }
}
