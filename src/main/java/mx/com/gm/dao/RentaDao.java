package mx.com.gm.dao;

import mx.com.gm.domain.Renta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentaDao  extends JpaRepository<Renta, Long>{
    
}
