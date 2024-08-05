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

    public Membro(DadosMembro dados) {
        this.nome =  dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.aniversario = dados.aniversario();
        this.endereco =  new Endereco(dados.endereco());
    }
}
