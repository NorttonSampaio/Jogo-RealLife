package controller;
// Generated 28/11/2018 04:55:57 by Hibernate Tools 4.3.1



/**
 * Jogador generated by hbm2java
 */
public class Jogador  implements java.io.Serializable {


     private Integer idJogador;
     private Necessidades necessidades;
     private String nome;
     private double dinheiro;
     private int dia;
     private String horario;

    public Jogador() {
    }

    public Jogador(Necessidades necessidades, String nome, double dinheiro, int dia, String horario) {
       this.necessidades = necessidades;
       this.nome = nome;
       this.dinheiro = dinheiro;
       this.dia = dia;
       this.horario = horario;
       cadastrar();
    }
    
    private void cadastrar(){
        model.Inserir inserir = new model.Inserir();
        inserir.save(this);
    }
    
    public void atualizar(){
        model.Atualizar atualizar = new model.Atualizar();
        atualizar.update(this);
    }
    
    public void deletar(){
        model.Deletar deletar= new model.Deletar();
        deletar.delete(this);
    }
    
    public Jogador[] buscarJogadores(){
        model.Buscar buscar = new model.Buscar();
        return buscar.buscarJogadores("From Jogador");
    }
    
    public Jogador buscarJogador(String nomeJogador){
        model.Buscar buscar = new model.Buscar();
        return buscar.buscarJogador("From Jogador where nome ='"+nomeJogador+"'");
    }
    
    public String[] getJogadores(){
        return new String[]{
            getNome()
        };
    }
   
    public Integer getIdJogador() {
        return this.idJogador;
    }
    
    public void setIdJogador(Integer idJogador) {
        this.idJogador = idJogador;
    }
    public Necessidades getNecessidades() {
        return this.necessidades;
    }
    
    public void setNecessidades(Necessidades necessidades) {
        this.necessidades = necessidades;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDinheiro() {
        return this.dinheiro;
    }
    
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }




}

