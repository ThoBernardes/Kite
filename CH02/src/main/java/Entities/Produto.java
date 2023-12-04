package Entities;
import Entities.Categoria;


import javax.persistence.*;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long idProduto;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "LOJA_ID")
    private Long lojaId;

    @Column(name = "UNIDADE_MEDIDA")
    private String unidadeMedida;

    @Column(name = "MEDIDA")
    private String medida;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "ID_PRECO_VENDA")
    private PrecoVenda precoVenda;

    @ManyToOne
    @JoinColumn(name = "ID_MARCA")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "ID_LOJA")
    private Loja loja;
}
