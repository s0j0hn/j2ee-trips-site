package com.suptrips;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by root on 02/12/15.
 */
public class JpaUsersDao implements UsersDao {

    private EntityManagerFactory emf;

    public JpaUsersDao(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public Users addUser(Users users) {
        Users result = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(users);
            em.getTransaction().commit();
            result = users;
        }finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
        return result;
    }

    @Override
    public Users findUserById(int idbooster) {
        Users result;

        EntityManager em = emf.createEntityManager();
        try {
            result = em.find(Users.class, idbooster);
        }catch (NoResultException e){
            result= null;
        }finally {
            em.close();
        }
        return result;
    }

    @Override
    public List<Users> getAllUsers() {
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaQuery<Users> criteriaQuery = em.getCriteriaBuilder().createQuery(Users.class);
            criteriaQuery.from(Users.class);
            return em.createQuery(criteriaQuery).getResultList();
        }finally {
            em.close();
        }
    }

    @Override
    public void updateUsers(Users users) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(users);
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
    }

    @Override
    public void removeUsers(Users users) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(em.merge(users));
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
    }
}
