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
    private String name;
    private String telefone;
    private String email;
    private String  aniversario;


    @Embedded
    private Endereco endereco;

}
