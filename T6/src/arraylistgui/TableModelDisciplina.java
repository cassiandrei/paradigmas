package arraylistgui;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrea
 */

class TableModelDisciplina extends AbstractTableModel {

    // Lista de disciplinas
    private ArrayList<Disciplina> discips;

    // Array com os nomes das colunas da tabela
    private static final String[] columnNames = {"Ano", "Semestre", "Nome", "Nota"};

    // Construtor default
    public TableModelDisciplina() {
        discips = new ArrayList<Disciplina>();
        // COMPLETE-ME: inicialize a lista com algumas disciplinas
    }

    // Metodo chamado pela GUI para remover um elemento
    public void remove(int index) {
        // COMPLETE-ME: remova o elemento de indice index da lista
	fireTableRowsDeleted(index, index);
    }

    // Metodo chamado pela GUI para selecionar um elemento
    public Disciplina select(int index) {
        // COMPLETE-ME: retorne o elemento de indice index da lista
    }

    // Metodo chamado pela GUI para inserir um elemento
    public void add(Disciplina d) {
        // COMPLETE-ME: insira a disciplina d na lista
        fireTableRowsInserted(discips.size()-1, discips.size()-1);
    }

    // Metodo chamado pela GUI para alterar um elemento
    public void update(int index, Disciplina d) {
        discips.set(index, d);
        fireTableRowsUpdated(index, index);
    }

    @Override
    public int getColumnCount() {
        // COMPLETE-ME: retorne o numero de colunas que a tabela devera conter
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return discips.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return discips.get(rowIndex).getAno();
            case 1: return discips.get(rowIndex).getSemestre();
            case 2: return discips.get(rowIndex).getNome();
            case 3: return discips.get(rowIndex).getNota();
        }
        return null;
    }

}

