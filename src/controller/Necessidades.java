package controller;
// Generated 28/11/2018 04:55:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Necessidades generated by hbm2java
 */
public class Necessidades  implements java.io.Serializable {


     private Integer idNecessidade;
     private int inteligencia;
     private byte fome;
     private byte sono;
     private byte necessidades;
     private byte higiene;
     private byte social;
     private byte diversao;
     private Set cidadePodeFazers = new HashSet(0);
     private Set jogadors = new HashSet(0);
     private Set itemPodeFazers = new HashSet(0);

    public Necessidades() {
    }

	
    public Necessidades(int inteligencia, byte fome, byte sono, byte necessidades, byte higiene, byte social, byte diversao) {
        this.inteligencia = inteligencia;
        this.fome = fome;
        this.sono = sono;
        this.necessidades = necessidades;
        this.higiene = higiene;
        this.social = social;
        this.diversao = diversao;
    }
    
    public Necessidades(int inteligencia, byte fome, byte sono, byte necessidades, byte higiene, byte social, byte diversao, Set cidadePodeFazers, Set jogadors, Set itemPodeFazers) {
       this.inteligencia = inteligencia;
       this.fome = fome;
       this.sono = sono;
       this.necessidades = necessidades;
       this.higiene = higiene;
       this.social = social;
       this.diversao = diversao;
       this.cidadePodeFazers = cidadePodeFazers;
       this.jogadors = jogadors;
       this.itemPodeFazers = itemPodeFazers;
    }
   
    public Integer getIdNecessidade() {
        return this.idNecessidade;
    }
    
    public void setIdNecessidade(Integer idNecessidade) {
        this.idNecessidade = idNecessidade;
    }
    public int getInteligencia() {
        return this.inteligencia;
    }
    
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public byte getFome() {
        return this.fome;
    }
    
    public void setFome(byte fome) {
        this.fome = fome;
    }
    public byte getSono() {
        return this.sono;
    }
    
    public void setSono(byte sono) {
        this.sono = sono;
    }
    public byte getNecessidades() {
        return this.necessidades;
    }
    
    public void setNecessidades(byte necessidades) {
        this.necessidades = necessidades;
    }
    public byte getHigiene() {
        return this.higiene;
    }
    
    public void setHigiene(byte higiene) {
        this.higiene = higiene;
    }
    public byte getSocial() {
        return this.social;
    }
    
    public void setSocial(byte social) {
        this.social = social;
    }
    public byte getDiversao() {
        return this.diversao;
    }
    
    public void setDiversao(byte diversao) {
        this.diversao = diversao;
    }
    public Set getCidadePodeFazers() {
        return this.cidadePodeFazers;
    }
    
    public void setCidadePodeFazers(Set cidadePodeFazers) {
        this.cidadePodeFazers = cidadePodeFazers;
    }
    public Set getJogadors() {
        return this.jogadors;
    }
    
    public void setJogadors(Set jogadors) {
        this.jogadors = jogadors;
    }
    public Set getItemPodeFazers() {
        return this.itemPodeFazers;
    }
    
    public void setItemPodeFazers(Set itemPodeFazers) {
        this.itemPodeFazers = itemPodeFazers;
    }




}


