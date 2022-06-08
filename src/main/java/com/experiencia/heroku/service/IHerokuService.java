
package com.experiencia.heroku.service;

import com.experiencia.heroku.model.Heroku;
import java.util.List;


public interface IHerokuService {
     public List<Heroku> verExperiencia();
    public void crearExperiencia(Heroku exp);
    public void borrarExperiencia (Long id);
    public Heroku buscarExperiencia(Long id);
    public void actualizarExperiencia(Heroku exp);
    public void updateExperiencia(Long id, Heroku exp);
}
