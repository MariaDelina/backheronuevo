
package com.experiencia.heroku.controller;

import com.experiencia.heroku.model.Heroku;
import com.experiencia.heroku.service.HerokuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT, RequestMethod.PATCH})
@RequestMapping(path="/api/experiencia")
public class HerokuController {
    @Autowired
    private HerokuService expServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Heroku> verExperiencias(){
        return expServ.verExperiencia();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Heroku buscarExperiencia(@PathVariable Long id){
       return expServ.buscarExperiencia(id);
    }
         
    @PostMapping("/create")
    public void agregarPersona(@RequestBody Heroku exp){
        expServ.crearExperiencia(exp);
    }
    @DeleteMapping("delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    @PutMapping("/actualizar")
    public void actualizarExperiencia(@RequestBody Heroku exp){
        expServ.actualizarExperiencia(exp);
    }
    @PutMapping("update/{id}")
    public void updateExperiencia(@PathVariable ("id") Long id, @RequestBody Heroku exp){
       expServ.updateExperiencia(id, exp);
    }  
}
