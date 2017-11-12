/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.service;

import com.jpa.crud.model.Motobike;
import com.jpa.crud.repository.MotobikeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leanghour
 */
@Service
public class MotobikeService {
    
    @Autowired
    private MotobikeRepository motobikeRepository;
    
    public Motobike findMotobike(int id)
    {
        return motobikeRepository.findMotobike(id);
    }
    public List<Motobike> findMotobikes()
    {
        return motobikeRepository.findMotobikes();
    }
    public Motobike saveMotobike(Motobike motobike)
    {
        return motobikeRepository.saveMotobike(motobike);
    }
    public boolean deleteMotobike(int id)
    {
        return motobikeRepository.deleteMotobike(id);
    }
    public Motobike updateMotobike(Motobike motobike)
    {
        return motobikeRepository.updateMotobike(motobike);
    }
    
}
