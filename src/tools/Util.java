/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {

    public static void habilitar(boolean valor, JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(valor);
        }

    }

    public static void limpar(JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof JTextField) {
                ((JTextField) comp[i]).setText("");
            }
            if (comp[i] instanceof JComboBox) {
                ((JComboBox) comp[i]).setSelectedIndex(-1);
            }
            if (comp[i] instanceof JCheckBox) {
                ((JCheckBox) comp[i]).setSelected(false);
            }
        }
    }

    public static void mostrar(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean perguntar(String mensagem) {
        JOptionPane.showConfirmDialog(null, mensagem);
        return false;
    }

    public static int setToInt(String cad) {
        return Integer.parseInt(cad);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double setToDouble(String cad) {
        return Double.parseDouble(cad);
    }

    public static Date strToDate(String cad) {
        return null;
    }

    public static String dateToStr(Date data) {
        return "";
    }

    public static String doubleToStr(double value) {
        return String.valueOf(value);
    }

    public static boolean strToBool(String cad) {
        return Boolean.parseBoolean(cad);
    }

    public static String boolToStr(boolean value) {
        return String.valueOf(value);
    }

}
