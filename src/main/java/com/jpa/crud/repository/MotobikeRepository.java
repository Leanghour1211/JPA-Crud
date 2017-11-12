/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.repository;

import com.jpa.crud.model.Motobike;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leanghour
 */
@Repository
@Transactional
public class MotobikeRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    public Motobike saveMotobike(Motobike motobike)
    {
        try
        {
            entityManager.persist(motobike);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        
        return motobike;
    }
    
    public Motobike updateMotobike(Motobike motobike)
    {
        return entityManager.merge(motobike);
    }
    public boolean deleteMotobike(int id)
    {
        Motobike motobike=entityManager.find(Motobike.class, id);
        if(motobike!=null)
        {
            entityManager.remove(motobike);
            return true;
        }
        return false;
    }
    
    public Motobike findMotobike(int id)
    {
        return entityManager.find(Motobike.class, id);
    }
    public List<Motobike> findMotobikes()
    {
        return entityManager.createQuery("Select moto from Motobike moto").getResultList();
    }
}
