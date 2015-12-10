package com.suptrips;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Date;
import java.util.List;


public class JpaTripsDao implements TripsDao {

    private EntityManagerFactory emf;

    public JpaTripsDao(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public Trips addTrip(Trips trips) {
        Trips result = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(trips);
            em.getTransaction().commit();
            result = trips;
        } finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
        return result;
    }

    @Override
    public Trips findTripsById(Long idtrip) {
        Trips result;

        EntityManager em = emf.createEntityManager();
        try {
            result = em.find(Trips.class, idtrip);
        }catch (NoResultException e){
            result= null;
        }finally {
            em.close();
        }
        return result;
    }

    @Override
    public List<Trips> getAllTrips() {
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaQuery<Trips> criteriaQuery = em.getCriteriaBuilder().createQuery(Trips.class);
            criteriaQuery.from(Trips.class);
            return em.createQuery(criteriaQuery).getResultList();
        }finally {
            em.close();
        }

    }

    @Override
    public List<Trips> getAllUsersTrips(Long idbooster) {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery("SELECT t FROM Trips t AS t WHERE t.users_idbooster = :id");
            query.setParameter("idbooster", idbooster);
            return (List<Trips>) query.getResultList();
        }catch (NoResultException e){
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public List<Trips> getAllTripsByDepartCampus(String dcampus) {
        return null;
    }

    @Override
    public List<Trips> getAllTripsByArriveCampus(String acampus) {
        return null;
    }

    @Override
    public void updateTrips(Trips trips) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(trips);
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
    }

    @Override
    public void removeTrips(Trips trips) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(em.merge(trips));
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            em.close();
        }
    }
}
