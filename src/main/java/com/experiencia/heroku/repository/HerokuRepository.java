
package com.experiencia.heroku.repository;

import com.experiencia.heroku.model.Heroku;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HerokuRepository extends JpaRepository<Heroku, Long>{
    
}
