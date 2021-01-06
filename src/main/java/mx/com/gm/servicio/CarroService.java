package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Carro;

public interface CarroService{
    
    public List<Carro> listarCarros();
    
    public void guardar(Carro carro);
    
    public void eliminar(Carro carro);
    
    public Carro encontrarCarro(Carro carro);
}
