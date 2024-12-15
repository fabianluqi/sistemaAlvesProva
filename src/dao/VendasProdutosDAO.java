package dao;

import bean.VendasProdutosLfm;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class VendasProdutosDAO extends DAO_Abstract {

    public static void main(String[] args) {
        //Exclusão
        VendasProdutosDAO vendasProdutosDAO = new VendasProdutosDAO();
        int idVendaProduto = 2;  // Substitua com o ID desejado
        VendasProdutosLfm vendaProdutos = (VendasProdutosLfm) vendasProdutosDAO.list(idVendaProduto);

        if (vendaProdutos != null) {

            vendasProdutosDAO.delete(vendaProdutos);
            System.out.println("Grupo excluído com sucesso.");
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }

    @Override
    public void insert(Object objeto) {
        session.beginTransaction();
        session.save(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(objeto);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasProdutosLfm.class);
        criteria.add(Restrictions.eq("idvendasProdutosLfm", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasProdutosLfm.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }

}
