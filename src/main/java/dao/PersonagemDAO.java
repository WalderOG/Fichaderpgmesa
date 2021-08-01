package dao;

import entities.Personagem;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class PersonagemDAO {
    public static Personagem inserir(Personagem personagem){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(personagem);
        entityTransaction.commit();
        em.close();
        return personagem;
    }
    public static Personagem pesquisar(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Personagem l = em.find(Personagem.class, id);
        em.close();
        return l;
    }
    public static void atualizar(Personagem personagem){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.merge(personagem);
        entityTransaction.commit();
        em.close();
    }
    public static void excluir(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        Personagem l = em.find(Personagem.class, id);
        entityTransaction.begin();
        em.remove(l);
        entityTransaction.commit();
        em.close();
    }

    public static List<Personagem> listar(){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        return em.createQuery("Select l from Personagem l", Personagem.class).getResultList();
    }

}
