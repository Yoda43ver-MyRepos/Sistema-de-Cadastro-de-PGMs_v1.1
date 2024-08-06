package br.com.ibns.pgm.membro;

import br.com.ibns.pgm.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name="Membro")
@Table(name="membros")
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String  aniversario;

    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Membro(DadosMembro dados) {
        this.ativo =  true;
        this.nome =  dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.aniversario = dados.aniversario();
        this.endereco =  new Endereco(dados.endereco());
    }

    public void atualizarInformacoesMembro(DadosAtualizacaoMembros dados) {
        if(dados.nome() != null){
           this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.aniversario() != null){
            this.aniversario = dados.aniversario();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoesEndereco(dados.endereco());
        }
    }

    public void inativar(){
        this.ativo = false;
    }
}
