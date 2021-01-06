package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ContactoDao;
import mx.com.gm.domain.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoDao contactoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> listarContactos() {
        return (List<Contacto>) contactoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    @Transactional
    public void eliminar(Contacto contacto) {
        contactoDao.delete(contacto);
    }

    @Override
    @Transactional(readOnly = true)
    public Contacto encontrarContacto(Contacto contacto) {
        return contactoDao.findById(contacto.getIdContacto()).orElse(null);
    }
}