package dao;

import bean.ClientesLfm;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ClientesDAO extends DAO_Abstract {

    public static void main(String[] args) {
//Inclusão 
        ClientesLfm clientes = new ClientesLfm();
        clientes.setNomeLfm("Masculino");

        ClientesDAO clientesDAO = new ClientesDAO();
        clientesDAO.insert(clientes);
        System.out.println("cliente inserido");

 

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
        Criteria criteria = session.createCriteria(ClientesLfm.class);
        criteria.add(Restrictions.eq("idclientesLfm", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesLfm.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }

}
