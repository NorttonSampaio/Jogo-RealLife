package controller;
// Generated 28/11/2018 04:55:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private Integer idCidade;
     private String nome;
     private Set cidadePodeFazers = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(String nome) {
        this.nome = nome;
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
    
    public Cidade[] buscarCidade(){
        model.Buscar buscar = new model.Buscar();
        return buscar.BuscarCidades("From Cidade");
    }
    
    public String[] getCidade(){
        return new String[]{
            nome
        };
    }
    
    public Cidade(String nome, Set cidadePodeFazers) {
       this.nome = nome;
       this.cidadePodeFazers = cidadePodeFazers;
    }
   
    public Integer getIdCidade() {
        return this.idCidade;
    }
    
    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getCidadePodeFazers() {
        return this.cidadePodeFazers;
    }
    
    public void setCidadePodeFazers(Set cidadePodeFazers) {
        this.cidadePodeFazers = cidadePodeFazers;
    }




}

