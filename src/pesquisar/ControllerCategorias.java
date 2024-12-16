package pesquisar;

import bean.CategoriasLfm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerCategorias extends AbstractTableModel {

    private List lista;

    public void setLista(List lista) {
        this.lista = lista;
    }

    public CategoriasLfm getBean(int rowIndex) {
        return (CategoriasLfm) lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CategoriasLfm usuario = (CategoriasLfm) lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuario.getIdcategoriasLfm();
        } else if (columnIndex == 1) {
            return usuario.getNomeLfm();
        } else if (columnIndex == 2) {
            return usuario.getDescricaoLfm();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "NOME";
        } else if (columnIndex == 2) {
            return "CPF";
        } else if (columnIndex == 3) {
            return "ATIVO";
        }
        return "";
    }
}
