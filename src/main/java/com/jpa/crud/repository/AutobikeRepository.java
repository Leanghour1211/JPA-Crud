/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.repository;

import com.jpa.crud.model.Autobike;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leanghour
 */
@Repository
@Transactional
public class AutobikeRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public Autobike saveAutobike(Autobike autobike)
    {
        try{
            entityManager.persist(autobike);
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return autobike;
    }
    public boolean deleteAutobike(int id)
    {
        Autobike autobike=entityManager.find(Autobike.class, id);
        if(autobike!=null)
        {
            entityManager.remove(autobike);
            return true;
        }
        return false;
    }
    public Autobike updateAutobike(Autobike autobike)
    {
        return entityManager.merge(autobike);
    }
    
    public Autobike findAutobike(int id)
    {
        return entityManager.find(Autobike.class, id);
    }
    
    public List<Autobike> findAutobikes()
    {
        return  entityManager.createQuery("Select autob from Autobike autob").getResultList();
    }
}
