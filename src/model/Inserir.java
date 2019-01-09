package model;

import controller.Catalogo;
import controller.Cidade;
import controller.CidadePodeFazer;
import controller.Comodo;
import controller.Item;
import controller.ItemPodeFazer;
import controller.Jogador;
import org.hibernate.Session;
import dao.NewHibernateUtil;
import org.hibernate.HibernateException;

public class Inserir {
    Session s=null;
    boolean flag=false;
    
    public Inserir(){
        
    }
    
    //Inserir
    public void save(Jogador j){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(j.getNecessidades());
            s.save(j);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(Cidade c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(CidadePodeFazer c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(c.getNecessidades());
            s.save(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(Comodo c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(Item i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(ItemPodeFazer i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(i.getNecessidades());
            s.save(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void save(Catalogo c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.save(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
}
