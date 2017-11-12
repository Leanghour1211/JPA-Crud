/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.controller.REST;


import com.jpa.crud.model.Autobike;
import com.jpa.crud.service.AutobikeService;
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
@RequestMapping(value = "/api/v1/autobikes")
public class AutobikeController {
    @Autowired
    private AutobikeService autobikeService;
    @GetMapping(value = "")
    public List<Autobike> findAutobikes()
    {
        List<Autobike> autobikes= autobikeService.findAutobikes();
        
        for(Autobike autobike:autobikes)
        {
            Link self=linkTo(methodOn(AutobikeController.class).findAutobike(autobike.getVihecle_id())).withSelfRel();
            autobike.add(self);
        }
        
        return autobikes;
    }
    @GetMapping(value = "/{id}")
    public Autobike findAutobike(@PathVariable int id)
    {
        Autobike autobike=autobikeService.findAutobike(id);
        Link self=linkTo(methodOn(AutobikeController.class).findAutobike(id)).withSelfRel();
        autobike.add(self);
        return autobike;
    }
    
    @PostMapping(value = "")
    public Autobike saveAutobike(@RequestBody Autobike autobike)
    {
        return autobikeService.saveAutobike(autobike);
    }
    @PutMapping(value = "/{id}")
    public Autobike updateAutobike(@PathVariable int id,@RequestBody Autobike autobike)
    {
        autobike.setVihecle_id(id);
        return autobikeService.updateAutobike(autobike);
    }
    @DeleteMapping(value = "/{id}")
    public boolean deleteAutobike(@PathVariable int id)
    {
        return autobikeService.deleteAutobike(id);
    }
    
    
}
