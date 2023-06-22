package com.mycompany.mapeamentojpahibernate;

import com.mycompany.mapeamentojpahibernate.modelo.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MapeamentoJpaHibernate {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        //Pessoa p2 = new Pessoa(null, "Joaqui Torres", "joaquim@gmail.com");
        //Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
       // em.getTransaction().begin();
        
       // em.persist(p1);
       // em.persist(p2);
       // em.persist(p3);
       // em.getTransaction().commit();
        System.out.println("PRONTO!");

       // System.out.println(p1);
       // System.out.println(p2);
       // System.out.println(p3);
       
       
       //Busca uma pessoa pelo ID
       Pessoa pessoa = em.find(Pessoa.class, 2);
       System.out.println(pessoa);
       
       
       //Exclui um campo
       Pessoa p = em.find(Pessoa.class, 2);
       em.getTransaction().begin();
       em.remove(p);
       em.getTransaction().commit();
       System.out.println("Excluido!");
       
        em.close();
        emf.close();

    }
}
