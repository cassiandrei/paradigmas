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

    private int level;
    private String jogador;
    private String personagem;
    private String habilidade;
    private String profissao;
    private String cargo;
    private String especialidade;

    public Personagem() {
    }
    
    public Personagem(String nome, String personagem, String profissao, String cargo, String especialidade, int level) {
        this.jogador = nome;
        this.personagem = personagem;
        this.profissao = profissao;
        this.cargo = cargo;
        this.especialidade = especialidade;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public String getEspecialidade() {
        return especialidade;
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
    
    public String getHabilidade() {
        return habilidade;
    }

    public void setJogador(String nome) {
        this.jogador = nome;
    }
    
    public void setCargo(String nome) {
        this.cargo = nome;
    }
    
    public void setEspecialidade(String nome) {
        this.especialidade = nome;
    }
    
    public void setHabilidade(String nome) {
        this.habilidade = nome;
    }
    
    public void setPersonagem(String nome) {
        this.personagem = nome;
    }
    
    public void setProfissao(String nome) {
        this.profissao = nome;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
}
