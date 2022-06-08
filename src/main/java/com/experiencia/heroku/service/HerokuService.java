
package com.experiencia.heroku.service;

import com.experiencia.heroku.model.Heroku;
import com.experiencia.heroku.repository.HerokuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerokuService implements IHerokuService{
    @Autowired 
            private HerokuRepository expRepo;

    @Override
    public List<Heroku> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Heroku exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Heroku buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarExperiencia(Heroku exp) {
        expRepo.save(exp);
    }

    @Override
    public void updateExperiencia(Long id, Heroku exp) {
        expRepo.findById(id);
        expRepo.save(exp);
    }

}
