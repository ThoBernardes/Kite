package Entities;

import javax.persistence.*;

@Entity
@Table(name = "MARCA")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MARCA")
    private Long idMarca;

    @Column(name = "NOME")
    private String nome;
}
