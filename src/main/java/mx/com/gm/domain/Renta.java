package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="renta")
public class Renta implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_renta")
    private Long idRenta;
    
    @NotEmpty
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    
    @NotEmpty
    @Column(name = "fecha_final")
    private Date fechaFinal;
    
    
    @JoinColumn(name="id_cliente",referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente cliente;
    
    @JoinColumn(name="id_carro",referencedColumnName = "id_carro")
    @ManyToOne
    private Carro carro;
    
    
}
