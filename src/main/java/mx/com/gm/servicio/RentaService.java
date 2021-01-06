package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Renta;

public interface RentaService{
    
    public List<Renta> listarRentas();
    
    public void guardar(Renta renta);
    
    public void eliminar(Renta renta);
    
    public Renta encontrarRenta(Renta renta);
} 