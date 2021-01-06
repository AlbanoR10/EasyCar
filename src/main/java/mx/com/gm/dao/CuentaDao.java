package mx.com.gm.dao;

import mx.com.gm.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaDao extends JpaRepository<Cuenta, Long>{
    Cuenta findByUsername(String username);
}
