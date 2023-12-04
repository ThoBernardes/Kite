package Entities;

import javax.persistence.*;

@Entity
@Table(name = "LOJA")
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOJA")
    private Long idLoja;

    @Column(name = "NOME_LOJA")
    private String nomeLoja;
}
