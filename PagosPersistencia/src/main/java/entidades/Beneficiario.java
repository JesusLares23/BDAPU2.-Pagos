
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jesús Lares
 * @author ...
 */
@Entity
@Table(name = "beneficiarios")
public class Beneficiario implements Serializable {

    @Id
    @Column(name = "id_beneficiario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "clave_contrato", nullable = false)
    private Integer claveContrato;
    
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    
    @Column(name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno", length = 50, nullable = true)
    private String apellidoMaterno;
    
    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;
    
    @Column(name = "contra", length = 100, nullable = false)
    private String contra;
    
    @Column(name = "saldo", precision = 10, scale = 2, nullable = false)
    private Double saldo;
    
    @OneToMany(mappedBy = "beneficiario", cascade = {CascadeType.PERSIST})
    private List<CuentaBancaria> cuentasBancarias;
    
    @OneToMany(mappedBy = "beneficiario", cascade = {CascadeType.PERSIST})
    private List<Pago> pagos;
    
}
