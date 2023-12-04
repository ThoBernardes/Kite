package Entities;

import javax.persistence.*;

@Entity
@Table(name = "PRECO_VENDA")
public class PrecoVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRECO_VENDA")
    private Long idPrecoVenda;

    @Column(name = "PRECO_VENDA")
    private Double precoVenda;
}
