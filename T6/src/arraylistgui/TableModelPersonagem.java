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

class TableModelPersonagem extends AbstractTableModel {

    // Lista de disciplinas
    private ArrayList<Personagem> discips;

    // Array com os nomes das colunas da tabela
    private static final String[] columnNames = {"Jogador", "Personagem", "Level", "Profissao", "Habilidade", "Cargo", "Especialidade"};

    // Construtor default
    public TableModelPersonagem() {
        discips = new ArrayList<Personagem>();
        
    }

    // Metodo chamado pela GUI para remover um elemento
    public void remove(int index) {
        // COMPLETE-ME: remova o elemento de indice index da lista
	fireTableRowsDeleted(index, index);
        discips.remove(index);
    }

    // Metodo chamado pela GUI para selecionar um elemento
    public Personagem select(int index) {
        // COMPLETE-ME: retorne o elemento de indice index da lista
        return discips.get(index);
    }

    // Metodo chamado pela GUI para inserir um elemento
    public void add(Personagem d) {
        // COMPLETE-ME: insira a disciplina d na lista
        
        fireTableRowsInserted(discips.size()-1, discips.size()-1);
        discips.add(d);
    }

    // Metodo chamado pela GUI para alterar um elemento
    public void update(int index, Personagem d) {
        discips.set(index, d);
        discips.set(index, d);
        fireTableRowsUpdated(index, index);
        
    }

    @Override
    public int getColumnCount() {
        // COMPLETE-ME: retorne o numero de colunas que a tabela devera conter
        return columnNames.length;
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
            case 0: return discips.get(rowIndex).getJogador();
            case 1: return discips.get(rowIndex).getPersonagem();
            case 2: return discips.get(rowIndex).getLevel();
            case 3: return discips.get(rowIndex).getProfissao();
            case 4: return discips.get(rowIndex).getHabilidade();
            case 5: return discips.get(rowIndex).getCargo();
            case 6: return discips.get(rowIndex).getEspecialidade();
        }
        return null;
    }

}

