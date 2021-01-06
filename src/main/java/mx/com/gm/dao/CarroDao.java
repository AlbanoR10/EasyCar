package mx.com.gm.dao;

import mx.com.gm.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroDao  extends JpaRepository<Carro, Long>{
    
}
