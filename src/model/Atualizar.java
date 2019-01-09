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

public class Atualizar {
    Session s=null;
    boolean flag=false;
    
    public Atualizar(){
        
    }
    
    //Inserir
    public void update(Jogador j){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.update(j.getNecessidades());
            s.update(j);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(Cidade c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.update(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(CidadePodeFazer c){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.update(c.getNecessidades());
            s.update(c);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(Comodo c, Comodo[] comodos){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            if(c!=null){
                s.update(c);
            }
            if(comodos!=null){
                int cont=0;
                while(cont<comodos.length){
                    s.update(comodos[cont]);
                    cont++;
                }
            }
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(Item i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.update(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(ItemPodeFazer i){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            s.update(i.getNecessidades());
            s.update(i);
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
    
    public void update(Catalogo c, Catalogo[] catalogos){
        try{
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            if(c!=null){
                s.update(c);
            }
            if(catalogos!=null){
                int cont=0;
                while(cont<catalogos.length){
                    s.update(catalogos[cont]);
                    cont++;
                }
            }
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
    }
}
