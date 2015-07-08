package arraylistgui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrea
 */
public class Personagem {

    private int ano;
    private int semestre;
    private int level;
    private String jogador;
    private String personagem;
    private String profissao;
    private float nota;

    public Personagem() {
    }
    
    public Personagem(int ano, int semestre, String nome, float nota) {
        this.ano = ano;
        this.semestre = semestre;
        this.jogador = jogador;
        this.nota = nota;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getJogador() {
        return jogador;
    }
    
    public String getPersonagem() {
        return personagem;
    }
    
    public String getProfissao() {
        return profissao;
    }

    public void setJogador(String nome) {
        this.jogador = nome;
    }
    
    public void setPersonagem(String nome) {
        this.personagem = nome;
    }
    
    public void setProfissao(String nome) {
        this.profissao = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
