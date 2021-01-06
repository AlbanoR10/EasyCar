package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="cuenta")
public class Cuenta implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private Long idCuenta;
    
    @NotEmpty
    private String usuario;
    
    @NotEmpty
    private String contrasena;
    
    @OneToMany
    @JoinColumn(name="id_cuenta")
    private List<Rol> roles;
}
