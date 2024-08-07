package br.com.ibns.pgm.pgm;

import br.com.ibns.pgm.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Entity
@Table(name = "pgms")
public class Pgm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dia;
    private String hora;

    private Endereco endereco;

    private Boolean ativo;

    public Pgm(DadosPgm dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.dia = dados.dia();
        this.hora = dados.hora();
        this.endereco = new Endereco(dados.endereco());
    }

    public void inativarPgm() {
      this.ativo = false;
    }

    public void activatePgm() {
        this.ativo = true;
    }

    public void atualizarDadosPgm(DadosAtualizacaoPgms dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.dia() !=  null){
            this.dia = dados.dia();
        }
        if(dados.hora() != null){
            this.hora = dados.hora();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoesEndereco(dados.endereco());
        }

    }
}
