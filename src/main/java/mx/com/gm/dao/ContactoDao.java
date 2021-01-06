package mx.com.gm.dao;

import mx.com.gm.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoDao  extends JpaRepository<Contacto, Long>{
    
}
