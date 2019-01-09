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
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

public class Buscar {
    Session s=null;
    boolean flag=false;
    
    public Buscar(){
        s=null;
    }
    
    public Jogador buscarJogador(String sql){
        Jogador j = null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            if(i.hasNext())j=(Jogador)i.next();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag){
                if(j!=null)System.out.print(j.getNecessidades().getDiversao());
                s.getTransaction().commit();
            }
        }
        return j;
    }
    
    public Jogador[] buscarJogadores(String sql){
        Jogador[] vetor = null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            if(i.hasNext()){
                vetor = new Jogador[l.size()];
                int cont=0;
                while(i.hasNext()){
                    vetor[cont]=(Jogador)i.next();
                    cont++;
                }
            }
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public Comodo[] buscarComodos(String sql){
        Comodo[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new Comodo[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(Comodo)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public Catalogo[] buscarCatalogos(String sql){
        Catalogo[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new Catalogo[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(Catalogo)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public Cidade[] BuscarCidades(String sql){
        Cidade[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new Cidade[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(Cidade)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public CidadePodeFazer[] BuscarCidadesPodeFazer(String sql){
        CidadePodeFazer[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new CidadePodeFazer[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(CidadePodeFazer)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public Item[] BuscarItem(String sql){
        Item[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new Item[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(Item)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
    
    public ItemPodeFazer[] BuscarItemPodeFazer(String sql){
        ItemPodeFazer[] vetor=null;
        try{
            flag=false;
            s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            flag=true;
            
            Query q = s.createQuery(sql);
            List l = q.list();
            Iterator i = l.iterator();
            
            vetor = new ItemPodeFazer[l.size()];
            
            int cont=0;
            
            while(i.hasNext()){
                vetor[cont]=(ItemPodeFazer)i.next();
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(flag)s.getTransaction().commit();
        }
        return vetor;
    }
}
