
package simulacion;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla3Simpson extends AbstractTableModel {

    private String[] columnas = {"Numero", "Aleatorio", "Probabilidad",};
    private ArrayList<csFila3Simpson> lista;

    public ModeloTabla3Simpson(ArrayList<csFila3Simpson> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (columna) {
            case 0:
                return this.lista.get(fila).getNumero();
            case 1:
                return this.lista.get(fila).getAleatorio();
            case 2:
                return this.lista.get(fila).getProbabilidad();
            

        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    }

}
