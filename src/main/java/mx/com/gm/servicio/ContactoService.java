package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Contacto;

public interface ContactoService{
    
    public List<Contacto> listarContactos();
    
    public void guardar(Contacto contacto);
    
    public void eliminar(Contacto contacto);
    
    public Contacto encontrarContacto(Contacto contacto);
}
