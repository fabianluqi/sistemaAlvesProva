package bean;
// Generated 15/12/2024 13:39:14 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CategoriasLfm generated by hbm2java
 */
@Entity
@Table(name = "categorias_lfm",
        catalog = "db_lucas_alves"
)
public class CategoriasLfm implements java.io.Serializable {

    private int idcategoriasLfm;
    private String nomeLfm;
    private String descricaoLfm;
    private String imagemLfm;
    private String statusLfm;
    private String hierarquiaLfm;

    public CategoriasLfm() {
    }

    public CategoriasLfm(String nomeLfm, String descricaoLfm, String imagemLfm, String statusLfm, String hierarquiaLfm) {
        this.nomeLfm = nomeLfm;
        this.descricaoLfm = descricaoLfm;
        this.imagemLfm = imagemLfm;
        this.statusLfm = statusLfm;
        this.hierarquiaLfm = hierarquiaLfm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idcategorias_lfm", unique = true, nullable = false)
    public int getIdcategoriasLfm() {
        return this.idcategoriasLfm;
    }

    public void setIdcategoriasLfm(int idcategoriasLfm) {
        this.idcategoriasLfm = idcategoriasLfm;
    }

    @Column(name = "nome_lfm", nullable = false, length = 45)
    public String getNomeLfm() {
        return this.nomeLfm;
    }

    public void setNomeLfm(String nomeLfm) {
        this.nomeLfm = nomeLfm;
    }

    @Column(name = "descricao_lfm", nullable = false, length = 60)
    public String getDescricaoLfm() {
        return this.descricaoLfm;
    }

    public void setDescricaoLfm(String descricaoLfm) {
        this.descricaoLfm = descricaoLfm;
    }

    @Column(name = "imagem_lfm", nullable = false, length = 80)
    public String getImagemLfm() {
        return this.imagemLfm;
    }

    public void setImagemLfm(String imagemLfm) {
        this.imagemLfm = imagemLfm;
    }

    @Column(name = "status_lfm", nullable = false, length = 10)
    public String getStatusLfm() {
        return this.statusLfm;
    }

    public void setStatusLfm(String statusLfm) {
        this.statusLfm = statusLfm;
    }

    @Column(name = "hierarquia_lfm", nullable = false, length = 1)
    public String getHierarquiaLfm() {
        return this.hierarquiaLfm;
    }

    public void setHierarquiaLfm(String hierarquiaLfm) {
        this.hierarquiaLfm = hierarquiaLfm;
    }

}