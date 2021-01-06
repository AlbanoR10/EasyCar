package mx.com.gm.domain;
    
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
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
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    
    @NotEmpty
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    
    @NotEmpty
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    
    @JoinColumn(name="id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne(cascade = CascadeType.ALL)
    private Cuenta cuenta;
    
    @JoinColumn(name="id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;
    
    
}
