package bean;
// Generated 15/12/2024 13:39:14 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProdutosLfm generated by hbm2java
 */
@Entity
@Table(name = "produtos_lfm",
        catalog = "db_lucas_alves"
)
public class ProdutosLfm implements java.io.Serializable {

    private int idprodutosLfm;
    private String nomeLfm;
    private double precoLfm;
    private String categoriaLfm;
    private String marcaLfm;
    private String descricaoLfm;
    private String imagemLfm;

    public ProdutosLfm() {
    }

    public ProdutosLfm(String nomeLfm, double precoLfm, String categoriaLfm, String marcaLfm, String descricaoLfm, String imagemLfm) {
        this.nomeLfm = nomeLfm;
        this.precoLfm = precoLfm;
        this.categoriaLfm = categoriaLfm;
        this.marcaLfm = marcaLfm;
        this.descricaoLfm = descricaoLfm;
        this.imagemLfm = imagemLfm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idprodutos_lfm", unique = true, nullable = false)
    public int getIdprodutosLfm() {
        return this.idprodutosLfm;
    }

    public void setIdprodutosLfm(int idprodutosLfm) {
        this.idprodutosLfm = idprodutosLfm;
    }

    @Column(name = "nome_lfm", nullable = true, length = 50)
    public String getNomeLfm() {
        return this.nomeLfm;
    }

    public void setNomeLfm(String nomeLfm) {
        this.nomeLfm = nomeLfm;
    }

    @Column(name = "preco_lfm", nullable = true, precision = 10)
    public double getPrecoLfm() {
        return this.precoLfm;
    }

    public void setPrecoLfm(double precoLfm) {
        this.precoLfm = precoLfm;
    }

    @Column(name = "categoria_lfm", nullable = true, length = 45)
    public String getCategoriaLfm() {
        return this.categoriaLfm;
    }

    public void setCategoriaLfm(String categoriaLfm) {
        this.categoriaLfm = categoriaLfm;
    }

    @Column(name = "marca_lfm", nullable = true, length = 30)
    public String getMarcaLfm() {
        return this.marcaLfm;
    }

    public void setMarcaLfm(String marcaLfm) {
        this.marcaLfm = marcaLfm;
    }

    @Column(name = "descricao_lfm", nullable = true, length = 60)
    public String getDescricaoLfm() {
        return this.descricaoLfm;
    }

    public void setDescricaoLfm(String descricaoLfm) {
        this.descricaoLfm = descricaoLfm;
    }

    @Column(name = "imagem_lfm", nullable = true, length = 100)
    public String getImagemLfm() {
        return this.imagemLfm;
    }

    public void setImagemLfm(String imagemLfm) {
        this.imagemLfm = imagemLfm;
    }

}
