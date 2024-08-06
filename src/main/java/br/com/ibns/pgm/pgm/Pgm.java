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

    public Pgm(DadosPgm dados) {
        this.nome = dados.nome();
        this.dia = dados.dia();
        this.hora = dados.hora();
        this.endereco = new Endereco(dados.endereco());

    }
}
