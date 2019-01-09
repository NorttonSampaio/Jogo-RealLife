package model;

import controller.Catalogo;
import controller.Cidade;
import controller.CidadePodeFazer;
import controller.Comodo;
import controller.Item;
import controller.ItemPodeFazer;
import controller.Jogador;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import dao.NewHibernateUtil;
import java.awt.Frame;
import org.hibernate.HibernateException;

public class Deletar {
    Session s=null;
    boolean flag=false;
    
    public Deletar(){
        
    }
    
    //Inserir
    public void delete(Jogador j){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(j.getNecessidades());
            s.delete(j);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(Cidade c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(c);
        }catch(HibernateException ex){            
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(CidadePodeFazer c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(c.getNecessidades());
            s.delete(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(Comodo c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(Item i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(ItemPodeFazer i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(i.getNecessidades());
            s.delete(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void delete(Catalogo c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.delete(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
}
