/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.controller.REST;

import com.jpa.crud.model.Motobike;
import com.jpa.crud.service.MotobikeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Leanghour
 */
@RestController
@RequestMapping(value = "/api/v1/motobikes")
public class MotobikeController {
    @Autowired
    private MotobikeService motobikeService;
    @GetMapping(value = "/{id}")
    public Motobike findMotobike(@PathVariable int id)
    {
        Motobike motobike = motobikeService.findMotobike(id);
        Link self=linkTo(methodOn(MotobikeController.class).findMotobike(id)).withSelfRel();
        motobike.add(self);
        return motobike;
    }
    
    @GetMapping(value = "")
    public List<Motobike> findMotobikes()
    {
        List<Motobike> motobikes=motobikeService.findMotobikes();
        for(Motobike motobike:motobikes)
        {
            Link self=linkTo(methodOn(MotobikeController.class).findMotobike(motobike.getVihecle_id())).withSelfRel();
            motobike.add(self);
        }
        return motobikes;
    }
    @PutMapping(value = "/{id}")
    public Motobike updateMotobike(@PathVariable int id,@RequestBody Motobike motobike)
    {
        motobike.setVihecle_id(id);
        return motobikeService.updateMotobike(motobike);
    }
    @DeleteMapping(value = "/{id}")
    public boolean deleteMotobike(@PathVariable int id)
    {
        return motobikeService.deleteMotobike(id);
    }
    @PostMapping(value = "")
    public Motobike saveMotobike(@RequestBody Motobike motobike)
    {
        return motobikeService.saveMotobike(motobike);
    }
}
