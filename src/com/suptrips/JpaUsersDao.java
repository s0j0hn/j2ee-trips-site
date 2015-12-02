package com.suptrips;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }

    @Override
    public void updateUsers(Users users) {

    }

    @Override
    public void removeUsers(Users users) {

    }
}
