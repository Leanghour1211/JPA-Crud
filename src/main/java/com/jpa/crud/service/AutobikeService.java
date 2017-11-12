/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.service;

import com.jpa.crud.model.Autobike;
import com.jpa.crud.repository.AutobikeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leanghour
 */
@Service
public class AutobikeService {
    
    @Autowired
    private AutobikeRepository autobikeRepository;
    
    public Autobike findAutobike(int id)
    {
        return autobikeRepository.findAutobike(id);
    }
    public List<Autobike> findAutobikes()
    {
        return autobikeRepository.findAutobikes();
    }
    public Autobike saveAutobike(Autobike autobike)
    {
        return autobikeRepository.saveAutobike(autobike);
    }
    public Autobike updateAutobike(Autobike autobike)
    {
        return autobikeRepository.updateAutobike(autobike);
    }
    public boolean deleteAutobike(int id)
    {
        return autobikeRepository.deleteAutobike(id);
    }
}
