package Entities;

import Entities.Produto;

import javax.persistence.*;

@Entity
@Table(name = "KITE")
public class Kite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BUSCA")
    private Long idBusca;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    @OneToOne
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", insertable = false, updatable = false)
    private Produto resultadoDeBusca;
}
