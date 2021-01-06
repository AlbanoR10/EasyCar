package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.RentaDao;
import mx.com.gm.domain.Renta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaServiceImpl implements RentaService {

    @Autowired
    private RentaDao rentaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Renta> listarRentas() {
        return (List<Renta>) rentaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Renta renta) {
        rentaDao.save(renta);
    }

    @Override
    @Transactional
    public void eliminar(Renta renta) {
        rentaDao.delete(renta);
    }

    @Override
    @Transactional(readOnly = true)
    public Renta encontrarRenta(Renta renta) {
        return rentaDao.findById(renta.getIdRenta()).orElse(null);
    }
}