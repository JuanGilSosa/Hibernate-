package principal.mysql.hibernate.Helpers;

/**
 * @author - Juan Gil Sosa 
 *         - Jr. Developer
 */


public class JTableHelper {
    /** 
     * <p><b>Note:</b> Inicia cualquier tabla, para trabajarla de manera 
     * dinamica
     * @param jtable es la tabla a la que necesita darle atributos
     * @param arrayColumn son los nombres de la columna para la tabla
     * @param bln si es true, permitimos que pueda agregar botones al jtable
     */
    public static void initJTable(javax.swing.JTable jtable, Object[] arrayColumn, Boolean bln){
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jtable.getModel();
        for(Object columnName : arrayColumn){
            model.addColumn(columnName);
        }
    }
    
    /**
     * @param jtable la tabla donde se agregara contenido a la fila
     * @param row es un arreglo de objetos donde estan todos los datos de la fila
     */
    public static void addData(javax.swing.JTable jtable, Object[] row){
        ((javax.swing.table.DefaultTableModel)jtable.getModel()).addRow(row);
    }
    
    /**
     * @param jtable la tabla que se reiniciara
     * <p><b>Note: </b> Se encarga de reiniciar un jtable - VER IMPLEMENTACION -
     */
    public static void resetJTable(javax.swing.JTable jtable){
        javax.swing.table.DefaultTableModel tm = new javax.swing.table.DefaultTableModel();
        jtable.setModel(tm);
        for (int i = tm.getRowCount() -1; i >= 0; i--){
            tm.removeRow(i);
        }
    }
    /**
     * @param copyOfJTable tabla que obtendra los datos
     * @param mainTable tabla principal que se quiere copiar
     */
    public static void copyJTable(javax.swing.JTable copyOfJTable, javax.swing.JTable mainTable){
        
        javax.swing.table.DefaultTableModel tmCopy = (javax.swing.table.DefaultTableModel)copyOfJTable.getModel();
        javax.swing.table.DefaultTableModel tmMain = (javax.swing.table.DefaultTableModel)mainTable.getModel();
        
        int[] indices = mainTable.getSelectedRows();
        for(int i : indices) {
            Object[] fila = new Object[tmMain.getColumnCount()];
            
            for(int j = 0; j < fila.length; j++) {
                fila[j] = tmMain.getValueAt(i, j);
            }
            tmCopy.addRow(fila);
        }
        
    }
    
    public static void setWidthColumn(javax.swing.JTable jtable, Integer columnNumber, Integer width){
        javax.swing.table.TableColumnModel columnModel = jtable.getColumnModel();
        columnModel.getColumn(columnNumber).setPreferredWidth(width);
    }
    
    /**
     * <p> <b>Descripcion: </b> Se encarga de generar un arreglo de String con el nombre
     * de las columnas que se tiene del jtable que se envie
     * @param jtable es de donde se sacara el nombre de las columnas
     * @return String[]
     */
    public static String[] getArrayOfColumnName(javax.swing.JTable jtable){
        String[] columns = new String[jtable.getColumnCount()];
        for(int i = 0;i<columns.length;i++){
            columns[i] = jtable.getColumnName(i);
        }
        return columns;
    }
    
    
    /**
     * <p> Recorre columna por columna desde el rowIndex para agregar a un arreglo
     * que contendra la informacion (row) para algun uso especifico
     * 
     * @param jtable de aca se sacan la info
     * @param rowIndex desde que fila se quiere sacar la informacion
     * @param length la cantidad de columnas 
     * @return Object[] -- retorna un arreglo de objetos, que seria la informacion extraida
     */
    public static Object[] getRowFromJTable(javax.swing.JTable jtable, int rowIndex, int length){
        Object[] rows = new Object[length];
        for(int columnIndex = 0;columnIndex<length;columnIndex++){
            rows[columnIndex] = jtable.getValueAt(rowIndex, columnIndex);
        }     
        return rows;
    }
    
    /**
     * @param jtable
     * @param rowNumber un int con el numero de la columna que se desea eliminar
     */
    public static void deleteRow(javax.swing.JTable jtable, int rowNumber){
        ((javax.swing.table.DefaultTableModel)jtable.getModel()).removeRow(rowNumber);
    }
    
    /**
     * @param jtable
     * @param index0 desde el principio a marcar
     * @param index1 hasta otro extremo
     */   
    public static void paintRowJTable(javax.swing.JTable jtable, int index0, int index1){
        jtable.getSelectionModel().setSelectionInterval(index0, index1);
    }
}
