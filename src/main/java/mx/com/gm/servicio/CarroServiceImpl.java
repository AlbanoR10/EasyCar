package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ClienteDao;
import mx.com.gm.dao.CarroDao;
import mx.com.gm.domain.Cliente;
import mx.com.gm.domain.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroDao carroDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Carro> listarCarros() {
        return (List<Carro>) carroDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Carro carro) {
        carroDao.save(carro);
    }

    @Override
    @Transactional
    public void eliminar(Carro carro) {
        carroDao.delete(carro);
    }

    @Override
    @Transactional(readOnly = true)
    public Carro encontrarCarro(Carro carro) {
        return carroDao.findById(carro.getIdCarro()).orElse(null);
    }
}